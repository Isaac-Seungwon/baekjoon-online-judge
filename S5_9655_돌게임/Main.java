package S5_9655_돌게임;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 돌의 개수
        int n = Integer.parseInt(br.readLine());

        // 동적 계획법을 활용한 배열 선언
        int[] dp = new int[1001];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 1;

        for (int i = 4; i <= n; i++) {
            dp[i] = Math.min(dp[i - 1], dp[i - 3]) + 1;
        }

        // 돌의 개수가 홀수이면 상근이(SK), 짝수이면 창영이(CY)가 승리
        if (dp[n] % 2 == 0) {
            System.out.print("CY");
        } else {
            System.out.print("SK");
        }
    }
}
