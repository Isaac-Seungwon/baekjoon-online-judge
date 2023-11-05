package B1_11170_0의개수;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt(); // 테스트 케이스 수

		for (int i = 0; i < T; i++) {
			int N = scan.nextInt(); // 시작 숫자
			int M = scan.nextInt(); // 끝 숫자
			int count = 0;

			for (int j = N; j <= M; j++) {
				count += countZeros(j);
			}

			System.out.println(count);
		}
	}

	public static int countZeros(int N) {
		if (N == 0) {
			return 1;
		}
		
		int count = 0;
		while (N > 0) {
			if (N % 10 == 0) {
				count++;
			}
			N /= 10;
		}
		return count;
	}

	public static long countChar(String temp, char ch) {
		return temp.chars().filter(c -> c == ch).count();
	}
}
