package S1_1914_하노이탑이동순서;

// 하노이 탑 원판의 이동 횟수 = 2 ^ N - 1
// N의 최댓값으로 100이 주어지는 경우 2 ^ 100 - 1은 int, long의 범위를 넘어가므로 BigInterger를 사용한다.
// 1(from_출발지), 2(via_경유지), 3(to_도착지) 총 3개의 기둥을 이용해 from에서 to 기둥으로 모든 원판을 옮겨야 한다.
// 만약 원판이 하나 남았을 경우(N == 1) from에서 바로 to로 이동한다.

import java.util.Scanner;
import java.math.BigInteger;

public class Main {
	private static StringBuilder moves = new StringBuilder();

    // 하노이 탑 이동 기록
    private static void move(int from, int to) {
        moves.append(from).append(" ").append(to).append("\n");
    }

    // 하노이 탑 알고리즘
    private static void hanoiTower(int n, int from, int to, int via) {
        if (n == 1) {
            move(from, to); // 원판이 하나 남은 경우
        } else {
            hanoiTower(n - 1, from, via, to); // N-1개 원판 from > via 이동
            move(from, to); // 가장 큰 원판 from > to 이동
            hanoiTower(n - 1, via, to, from); // N-1개 원판 via > to 이동
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt(); // 원판 개수

        // 이동 횟수 출력
        BigInteger moveCount = BigInteger.valueOf(2).pow(N).subtract(BigInteger.ONE); // 2 ^ N - 1
        System.out.println(moveCount);
        
        // N이 20보다 큰 경우에만 과정 출력
        if (N <= 20) {
            // 하노이 탑 알고리즘 호출
            hanoiTower(N, 1, 3, 2);

            // 이동 경로 출력
            System.out.print(moves);
        }
    }
}