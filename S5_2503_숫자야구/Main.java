package S5_2503_숫자야구;

import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int N = scan.nextInt(); // 시도 횟수

		int count = 0; // 정답 후보 개수
		int[][][] answer = new int[10][10][10]; // 정답 후보

		// 정답 후보 초기화
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				for (int k = 1; k <= 9; k++) {
					if (i != j && j != k && i != k) { // 서로 다른 숫자 3개
						answer[i][j][k] = 1;
					}
				}
			}
		}

		for (int attemptNum = 0; attemptNum < N; attemptNum++) {
			count = 0;
			int num = scan.nextInt(); // 3개의 정수
			int strike = scan.nextInt(); // 스트라이크 개수
			int ball = scan.nextInt(); // 볼 개수
			int[] arrayNum = Stream.of(String.valueOf(num).split("")).mapToInt(Integer::parseInt).toArray(); // 자리별 저장

			for (int i = 1; i <= 9; i++) {
				for (int j = 1; j <= 9; j++) {
					for (int l = 1; l <= 9; l++) {
						// 스트라이크 개수 계산
						int thisStrike = 0;
						if (i == arrayNum[0])
							thisStrike++;
						if (j == arrayNum[1])
							thisStrike++;
						if (l == arrayNum[2])
							thisStrike++;

						// 볼 개수 계산
						int thisBall = 0;
						if (i == arrayNum[1] || i == arrayNum[2])
							thisBall++;
						if (j == arrayNum[0] || j == arrayNum[2])
							thisBall++;
						if (l == arrayNum[0] || l == arrayNum[1])
							thisBall++;

						// 정답 후보 제거
						if (thisStrike != strike || thisBall != ball) {
							answer[i][j][l] = 0;
						}

						// 정답 카운트
						if (answer[i][j][l] == 1) {
							count++;
						}
					}
				}
			}
		}

		System.out.println(count);
	}
}