package B1_11170_0의개수;

import java.util.Scanner;

public class Temp1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 몇개 입력할지
		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {
			int N = sc.nextInt();
			int M = sc.nextInt();

			int num = 0;

			for (int a = N; a <= M; a++) {

				// 따로
				int b = a;

				if (b == 0) {
					num++;
					continue;
				}

				while (b != 0) {

					if (b % 10 == 0) {
						num++;
					}
					// 1의 자리 10의 자리 100의 자리~
					b /= 10;
				}

			}

			System.out.println(num);

		}
		sc.close();
	}
}