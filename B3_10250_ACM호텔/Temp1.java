package B3_10250_ACM호텔;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Temp1 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int a = Integer.parseInt(br.readLine()); //받을 데이터 횟수

		for (int i = 0; i < a; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			//StringTokenizer: split과 같이 데이터를 끊는 역할

			String e = "";
			
			int b = Integer.parseInt(st.nextToken());
			st.nextToken();
			int d = Integer.parseInt(st.nextToken());
			
			/*
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
			*/

			if (d % b == 0) {
				e = e + b;
			} else {
				e = e + (d % b);
			}
			
			double f = Math.ceil((double) d / (double) b);
			
			if (f < 10) {
				e = e + "0";
			}
			
			bw.write(e + (int) f + "\n");

		}
		bw.flush();
		bw.close();
		br.close();
	}

}