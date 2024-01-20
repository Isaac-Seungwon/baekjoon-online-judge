package B1_2456_나는학급회장이다;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Temp2 {
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer tokens;
	static int N;
	static List<Candidate> list = new ArrayList<>();

	public static void main(String[] args) throws NumberFormatException, IOException {
		input = new BufferedReader(new StringReader(src));
		N = Integer.parseInt(input.readLine());
		list.add(new Candidate(1, 0, 0, 0, 0));
		list.add(new Candidate(2, 0, 0, 0, 0));
		list.add(new Candidate(3, 0, 0, 0, 0));

		for (int n = 0; n < N; n++) {
			tokens = new StringTokenizer(input.readLine());
			int first = Integer.parseInt(tokens.nextToken());
			int second = Integer.parseInt(tokens.nextToken());
			int third = Integer.parseInt(tokens.nextToken());

			if (first == 1) {
				list.get(0).score1++;
			} else if (first == 2) {
				list.get(0).score2++;
			} else {
				list.get(0).score3++;
			}
			
			if (second == 1) {
				list.get(1).score1++;
			} else if (second == 2) {
				list.get(1).score2++;
			} else {
				list.get(1).score3++;
			}
			
			if (third == 1) {
				list.get(2).score1++;
			} else if (third == 2) {
				list.get(2).score2++;
			} else {
				list.get(2).score3++;
			}
			
			list.get(0).sum += first;
			list.get(1).sum += second;
			list.get(2).sum += third;
		}
		
		Collections.sort(list);
		// System.out.println(list);
		
		boolean flag = false;
		if (list.get(0).sum == list.get(1).sum) {
			if (list.get(0).score3 == list.get(1).score3) {
				if (list.get(0).score2 == list.get(1).score2) {
					flag = true;
				}
			}
		}

		if (flag) {
			System.out.println(0 + " " + list.get(0).sum);
		} else {
			System.out.println(list.get(0).num + " " + list.get(0).sum);
		}
	}

	static class Candidate implements Comparable<Candidate> {
		int num;
		int score3;
		int score2;
		int score1;
		int sum;

		public Candidate(int num, int score3, int score2, int score1, int sum) {
			super();
			this.num = num;
			this.score3 = score3;
			this.score2 = score2;
			this.score1 = score1;
			this.sum = sum;
		}

		@Override
		public int compareTo(Candidate o) {
			if (this.sum == o.sum) {
				if (this.score3 == o.score3) {
					return Integer.compare(o.score2, this.score2);
				}
				return Integer.compare(o.score3, this.score3);
			}
			return Integer.compare(o.sum, this.sum);
		}
	}

	static String src = "6\r\n" + "3 1 2\r\n" + "2 3 1\r\n" + "3 1 2\r\n" + "1 2 3\r\n" + "3 1 2\r\n" + "1 2 3";
}