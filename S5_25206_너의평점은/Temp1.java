package S5_25206_너의평점은;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
   문제 : 25206번
   조건 : 등급 P는 계산에서 제외
*/
public class Temp1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String rank_arr[] = { "A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F", "P" };
		Double grade_arr[] = { 4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0 };

		double total_grade = 0;
		double total_score = 0;
		for (int i = 0; i < 20; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			st.nextToken(); // 첫번째 호출-과목명
			double grade = Double.parseDouble(st.nextToken()); // 두번째 호출-학점
			String rank = st.nextToken(); // 세번째 호출-등급(A+)

			if (!rank.equals("P")) {
				for (int j = 0; j < grade_arr.length; j++) {
					if (rank.equals(rank_arr[j])) {
						total_grade += grade; // 나중에 나눌 총 학점
						total_score += (grade * grade_arr[j]);
					}
				}
			}
		}
		System.out.println(total_score / total_grade);
	}
}