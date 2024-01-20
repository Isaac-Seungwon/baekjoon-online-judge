package S4_1018_체스판다시칠하기;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Temp1 {
//체스판
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		String[] arr = new String[n];

		for (int i = 0; i < n; i++) {
			arr[i] = br.readLine();
		}

		int result = Integer.MAX_VALUE; // 결과(최소 정사각형 개수)
		int count = 0; // 수정할 정사각형 개수

		for (int i = 0; i <= n - 8; i++) { // 체스판이 8칸이므로 8칸을 남기고 검사
			for (int j = 0; j <= m - 8; j++) {

				count = boardCheck(i, j, arr); // 경우의 수 검사
				result = Math.min(result, count); // 경우의 수 중에서 최소 값을 결과에 대입한다.
			}
		}

		System.out.println(result);
	}

	private static int boardCheck(int startRow, int startCol, String[] arr) {
		String[] orgBoard = { "WBWBWBWB", "BWBWBWBW" };
		int whiteCol = 0;

		for (int i = 0; i < 8; i++) {
			int row = startRow + i; // 사용자가 입력한 보드판의 현재 row
			for (int j = 0; j < 8; j++) {
				int col = startCol + j; // 사용자가 입력한 보드판의 현재 col

				if (arr[row].charAt(col) != orgBoard[row % 2].charAt(j)) {
					whiteCol++;
				}
			}
		}

		// W로 시작한 보드판과 B로 시작한 보드판 중에서 적은 값으로 리턴
		return Math.min(whiteCol, 64 - whiteCol);
	}
}