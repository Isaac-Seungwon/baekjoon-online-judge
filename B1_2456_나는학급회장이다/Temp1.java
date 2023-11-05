package B1_2456_나는학급회장이다;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Temp1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // 선호도 점수와 후보별 투표 결과를 저장하는 배열
        int[][] scores = new int[4][N];
        int[][] voteCounts = new int[4][4]; // [후보번호][선호도] = 투표 횟수

        // 학생들의 선호도 점수 입력 및 투표 결과 계산
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= 3; j++) {
                scores[j][i] = Integer.parseInt(st.nextToken());
                voteCounts[j][scores[j][i]]++; // 해당 후보에 대한 해당 선호도 투표 횟수 증가
            }
        }

        // 후보의 총 점수를 계산하고 정렬
        int[][] totalScores = new int[4][2]; // [후보번호][총 점수, 후보번호]
        for (int i = 1; i <= 3; i++) {
            totalScores[i][0] = Arrays.stream(scores[i]).sum();
            totalScores[i][1] = i;
        }
        Arrays.sort(totalScores, (a, b) -> {
            if (a[0] == b[0]) {
                return voteCounts[b[1]][3] - voteCounts[a[1]][3]; // 3점 투표 비교
            } else {
                return b[0] - a[0];
            }
        });

        // 동점자가 있는지 확인
        if (totalScores[0][0] == totalScores[1][0]) {
            int[] voteCounts1 = Arrays.copyOfRange(voteCounts[totalScores[0][1]], 1, 4);
            int[] voteCounts2 = Arrays.copyOfRange(voteCounts[totalScores[1][1]], 1, 4);

            // 동률자 중 3점 투표 수가 같다면 2점 투표 수로 결정
            if (Arrays.equals(voteCounts1, voteCounts2)) {
                if (voteCounts1[2] == voteCounts2[2]) {
                    System.out.println(0 + " " + totalScores[0][0]);
                } else if (voteCounts1[2] > voteCounts2[2]) {
                    System.out.println(totalScores[0][1] + " " + totalScores[0][0]);
                } else {
                    System.out.println(totalScores[1][1] + " " + totalScores[1][0]);
                }
            } else if (voteCounts1[2] > voteCounts2[2]) {
                System.out.println(totalScores[0][1] + " " + totalScores[0][0]);
            } else {
                System.out.println(totalScores[1][1] + " " + totalScores[1][0]);
            }
        } else {
            System.out.println(totalScores[0][1] + " " + totalScores[0][0]);
        }
    }
}
