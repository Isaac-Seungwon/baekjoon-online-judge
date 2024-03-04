package S3_29155_개발자지망생구름이의취업뽀개기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class Temp {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("시작 숫자 입력: ");
		int n = Integer.parseInt(br.readLine());
		
		System.out.print("끝 숫자 입력: ");
		int m = Integer.parseInt(br.readLine());
		
		IntStream.range(n, m + 1).forEach(i -> {
			IntStream.range(1, 10).forEach(j -> {
				System.out.print(i + " * " + j + " = " + String.format("%2d", i * j));
				System.out.print(" ");
			});
			System.out.println();
		});
		
	}
}
