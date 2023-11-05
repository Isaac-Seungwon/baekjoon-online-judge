package B2_2511_카드놀이;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] cardsA = new int[10];
        int[] cardsB = new int[10];
        int scoreA = 0;
        int scoreB = 0;
        int lastRoundWinner = -1; // 초기값 -1 무승부

        // A B 카드 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 10; i++) {
            cardsA[i] = Integer.parseInt(st.nextToken());
        }

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < 10; i++) {
            cardsB[i] = Integer.parseInt(st2.nextToken());
        }

        // 라운드 승자 결정
        for (int i = 0; i < 10; i++) {
            if (cardsA[i] > cardsB[i]) {
                scoreA += 3;
                lastRoundWinner = 0; // A 승
            } else if (cardsA[i] < cardsB[i]) {
                scoreB += 3;
                lastRoundWinner = 1; // B 승
            } else {
                scoreA++;
                scoreB++;
            }
        }

        System.out.printf("%d %d\n", scoreA, scoreB);

        // 승자 결정
        if (scoreA > scoreB) {
            System.out.println('A');
        } else if (scoreB > scoreA) {
            System.out.println('B');
        } else {
            if (lastRoundWinner == -1) {
                System.out.println('D'); // 모든 라운드 무승부
            } else {
                System.out.println(lastRoundWinner == 0 ? 'A' : 'B');
            }
        }
    }
}
