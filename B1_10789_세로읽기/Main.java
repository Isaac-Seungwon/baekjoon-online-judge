package B1_10789_세로읽기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
상근이는 요즘 설탕공장에서 설탕을 배달하고 있다.
상근이는 지금 사탕가게에 설탕을 정확하게 N킬로그램을 배달해야 한다.
설탕공장에서 만드는 설탕은 봉지에 담겨져 있다.
봉지는 3킬로그램 봉지와 5킬로그램 봉지가 있다.

상근이는 귀찮기 때문에, 최대한 적은 봉지를 들고 가려고 한다.
예를 들어, 18킬로그램 설탕을 배달해야 할 때, 3킬로그램 봉지 6개를 가져가도 되지만,
5킬로그램 3개와 3킬로그램 1개를 배달하면, 더 적은 개수의 봉지를 배달할 수 있다.

상근이가 설탕을 정확하게 N킬로그램 배달해야 할 때,
봉지 몇 개를 가져가면 되는지 그 수를 구하는 프로그램을 작성하시오.
*/

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 다섯 줄 단어 입력
		String[] words = new String[5];
		for (int i = 0; i < 5; i++) {
			words[i] = br.readLine();
		}

		// 가장 긴 단어 길이 계산
		int maxLen = 0;
		for (String word : words) {
			maxLen = Math.max(maxLen, word.length());
		}

		// 세로읽기
		StringBuilder result = new StringBuilder();
		for (int j = 0; j < maxLen; j++) {
			for (int i = 0; i < 5; i++) {
				if (j < words[i].length()) {
					result.append(words[i].charAt(j));
				}
			}
		}

		System.out.println(result.toString());
	}
}
