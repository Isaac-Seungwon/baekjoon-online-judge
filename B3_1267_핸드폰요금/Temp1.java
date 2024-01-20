package B3_1267_핸드폰요금;

import java.util.Scanner;

public class Temp1 {
	public static void main(String[] args) {
		/*
		 * 영식요금제 : 0 < 30초 = 10원 30 < 60 = 20원 민식요금제 : 0 < 60 = 15원 60 < 120 = 30원
		 * 
		 * 첫째줄 = 통화 개수 둘째줄 = 통화 시간
		 */

		Scanner scan = new Scanner(System.in);
		String num = scan.nextLine();
		String[] mm = scan.nextLine().split(" ");
		int[] nums = new int[mm.length];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = Integer.parseInt(mm[i]);
		}

		// num = {40, 40, 40}
		int youngsikpay = 0;
		int minsikpay = 0;

		// 요금제 계산
		for (int i = 0; i < nums.length; i++) {

			youngsikpay += (nums[i] / 30 + 1) * 10;
			minsikpay += (nums[i] / 60 + 1) * 15;

		}
		if (minsikpay < youngsikpay) {
			System.out.println("M " + minsikpay);
		} else if (minsikpay == youngsikpay) {
			System.out.println("Y M " + minsikpay);
		} else if (youngsikpay < minsikpay) {
			System.out.println("Y " + youngsikpay);
		}

	}

}