package B1_2456_나는학급회장이다;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] scores = new int[4][N]; // 각 학생이 후보 1, 2, 3에게 준 선호도 점수를 저장하는 배열
        int[][] sum = new int[4][5]; // 각 후보의 점수 및 투표 결과를 저장하는 배열

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= 3; j++) {
                scores[j][i] = Integer.parseInt(st.nextToken());
                sum[j][0] += scores[j][i]; // 각 후보의 총 점수 계산
                sum[j][(scores[j][i] - 1) % 3 + 1]++; // 해당 선호도 점수의 투표 수 증가
                sum[j][4] = j; // 후보 번호 저장
            }
        }

        Arrays.sort(sum, (a, b) -> {
            if (a[0] == b[0]) {
                return b[1] - a[1];
            } else {
                return b[0] - a[0];
            }
        });

        int[] arr1 = Arrays.copyOfRange(sum[0], 1, 4);
        int[] arr2 = Arrays.copyOfRange(sum[1], 1, 4);
        
        if (sum[0][0] == sum[1][0]) {
            if (is(arr1, arr2)) {
                System.out.println(0 + " " + sum[0][0]); // 회장 결정 불가능한 경우 출력
            } else {
                System.out.println(sum[0][4] + " " + sum[0][0]); // 동점자 중 3점 투표 수로 결정
            }
        } else {
            System.out.println(sum[0][4] + " " + sum[0][0]); // 유일하게 회장 결정되는 경우 출력
        }
    }

    private static boolean is(int[] a, int[] b) {
        for (int s = 0; s < 3; s++) {
            if (a[s] != b[s]) {
                return false;
            }
        }
        return true;
    }
}
