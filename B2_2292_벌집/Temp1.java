package B2_2292_벌집;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 2292 벌집 브론즈2
public class Temp1 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		int count = 1; // 거리
		int range = 2; // 범위

		if (N == 1) {
			System.out.println(1);
		} else {
			while (range <= N) {
				range = range + (6 * count);
				count++;
			}
			System.out.println(count);
		}
	}
}
