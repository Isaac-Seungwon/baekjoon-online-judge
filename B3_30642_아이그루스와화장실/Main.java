package B3_30642_아이그루스와화장실;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt(); // 동아리방의 층수
		String mascot = scan.next(); // 마스코트의 이름
		int K = scan.nextInt(); // 마스코트가 현재 있는 층

		if (N < 2 || N > 20_000 || K < 1 || K > N) {
			System.out.println("잘못된 입력");
			return;
		}

		// 마스코트의 몸집에 따른 화장실의 층 출력
		int result = findRestroom(N, K, mascot);
		System.out.println(result);
	}

	// 가장 가까운 화장실을 찾는 메서드
	private static int findRestroom(int N, int K, String mascot) {
		int restroom;

		if (mascot.equals("annyong")) {
			restroom = (K % 2 == 0) ? K - 1 : K; // K가 홀수이면 K, 짝수이면 K - 1
		} else {
			restroom = (K % 2 == 0) ? K : K + 1; // K가 홀수이면 K + 1, 짝수이면 K
		}

		// 층이 N을 초과하지 않도록 함
		if (restroom > N) {
			restroom = (N % 2 == 0) ? N : N - 1;
		}

		return restroom;
	}
}
