package B2_2798_블랙잭;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N, M;
		N = scan.nextInt();
		M = scan.nextInt();
		
		int sum = 0;
		int tmp = 0;
		int arr[] = new int[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = scan.nextInt();
		}

		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N; j++) {
				for (int k = j + 1; k < N; k++) {
					sum = arr[i] + arr[j] + arr[k];
					if (tmp < sum && sum <= M) {
						tmp = sum;
					}
				}
			}
		}
		System.out.println(tmp);
	}
}
