package B3_5086_배수와약수;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        while (true) {
            int num1 = scan.nextInt();
            int num2 = scan.nextInt();
            
            if (num1 == 0 && num2 == 0) {
                break;
            }
            
            if (isFactor(num1, num2)) {
                System.out.println("factor");
            } else if (isMultiple(num1, num2)) {
                System.out.println("multiple");
            } else {
                System.out.println("neither");
            }
        }
    }
    
    private static boolean isFactor(int num1, int num2) {
        return num2 % num1 == 0;
    }
    
    private static boolean isMultiple(int num1, int num2) {
        return num1 % num2 == 0;
    }
}
