package S4_2839_설탕배달;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int weight = scan.nextInt();
		int count = 0;
		int result = 0;

		while (true) {
			if (weight % 5 == 0) {
				result = weight / 5 + count;
				break;
			} else if (weight < 0) {
				result = -1;
				break;
			}
			weight = weight - 3;
			count++;
		}

		System.out.println(result);
	}
}

/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int weight = scan.nextInt();
        int count = 0;

        while (weight % 5 != 0 && weight >= 0) {
            weight -= 3;
            count++;
        }

        int result = (weight < 0) ? -1 : count + weight / 5;
        System.out.println(result);
    }
}
*/