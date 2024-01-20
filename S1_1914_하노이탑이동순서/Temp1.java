package S1_1914_하노이탑이동순서;

import java.io.*;
import java.math.BigInteger;

public class Temp1 {

	static StringBuilder sb = new StringBuilder();

	static void hanoi(int k, int s, int e) {
		if (k == 0)
			return;

		hanoi(k - 1, s, 6 - s - e);
		sb.append(s).append(' ').append(e).append('\n');
		hanoi(k - 1, 6 - s - e, e);
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BigInteger cnt = BigInteger.ONE;
		int n = Integer.parseInt(br.readLine());

		for (int i = 2; i <= n; ++i) {
			cnt = cnt.multiply(BigInteger.valueOf(2)).add(BigInteger.ONE);
		}

		sb.append(cnt).append('\n');

		if (n <= 20)
			hanoi(n, 1, 3);

		System.out.println(sb);
	}
}
