package S5_2503_숫자야구;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class temp1 {
	static int n;
	static int[] arr;
	static int[] strike;
	static int[] ball;

	public static void main(String[] args) throws Exception {

		// 스트라이크 : 동일한 자리 위치
		// 볼 : 동일한 숫자, 다른 위치

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		n = Integer.parseInt(br.readLine());
		arr = new int[n];
		strike = new int[n];
		ball = new int[n];

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i] = Integer.parseInt(st.nextToken());
			strike[i] = Integer.parseInt(st.nextToken());
			ball[i] = Integer.parseInt(st.nextToken());
		}

		System.out.println(calNumBaseBall());
	}

	private static int calNumBaseBall() {

		int result = 0;
		int strike_temp = 0;
		int ball_temp = 0;
		int count = 0;

		// 1에서 9까지의 서로 다른 숫자 세 개로 구성된 세 자리 수
		for (int i = 123; i <= 987; i++) {
			if (!checkContinuNum(i))
				continue;
			count = 0;
			for (int j = 0; j < strike.length; j++) {
				strike_temp = 0;
				ball_temp = 0;

				if (arr[j] / 100 == i / 100)
					strike_temp++;
				if (arr[j] / 10 % 10 == i / 10 % 10)
					strike_temp++;
				if (arr[j] % 10 == i % 10)
					strike_temp++;

				if ((arr[j] / 100 == i / 10 % 10) || (arr[j] / 100 == i % 10))
					ball_temp++;
				if ((arr[j] / 10 % 10 == i / 100) || (arr[j] / 10 % 10 == i % 10))
					ball_temp++;
				if ((arr[j] % 10 == i / 10 % 10) || (arr[j] % 10 == i / 100))
					ball_temp++;

				if ((strike[j] != strike_temp) || (ball[j] != ball_temp)) {
					break;
				}
				count++;
				if (count == n) {
					result++;
				}
			}
		}
		return result;
	}

	private static boolean checkContinuNum(int i) {
		// i/100은 백의 자리, i/10%10는 십의 자리, i%10은 일의 자리

		if (i / 100 == i / 10 % 10)
			return false;
		if (i / 10 % 10 == i % 10)
			return false;
		if (i / 100 == i % 10)
			return false;
		if (i / 10 % 10 == 0)
			return false;
		if (i % 10 == 0)
			return false;

		return true;
	}

}