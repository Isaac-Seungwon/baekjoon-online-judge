package S5_10431_줄세우기;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Temp1 {
//줄세우기
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st;

		int n = Integer.parseInt(br.readLine()); // 테스트 케이스 횟수
		int tc = 0; // 테스트 케이스
		int result = 0; // n별 이동횟수

		for (int i = 0; i < n; i++) {
			result = 0;
			int arr[] = new int[20];
			st = new StringTokenizer(br.readLine());

			tc = Integer.parseInt(st.nextToken());

			// 배열 담기
			for (int j = 0; j < arr.length; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}

			// 정렬
			for (int j = 0; j < arr.length - 1; j++) {
				for (int k = j + 1; k < arr.length; k++) {
					if (arr[j] > arr[k]) {
						result++;
					}
				}
			}

			// 결과 출력
			System.out.printf("%d %d\n", tc, result);
		}

	}
}