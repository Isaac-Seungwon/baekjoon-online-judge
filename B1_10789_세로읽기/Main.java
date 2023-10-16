package B1_10789_세로읽기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
