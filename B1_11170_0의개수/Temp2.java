package B1_11170_0의개수;

import java.util.*;

/*
 * 백준 11170 : 0의 개수
 * 조건 : 조건 없음
 */

public class Temp2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();

		for (int i = 0; i < test; i++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int cnt = 0;

			for (int j = N; j <= M; j++) {
				String num = String.valueOf(j); // 숫자를 문자열로 형변환
				for (int k = 0; k < num.length(); k++) {
					if (num.charAt(k) == '0') {
						cnt++;
					}
				}
			}
			
			System.out.println(cnt);
		}
	}
}