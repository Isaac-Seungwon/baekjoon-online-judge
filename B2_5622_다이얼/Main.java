package B2_5622_다이얼;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine().toUpperCase();

        int sec = 0;

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            sec += getDialTime(c);
        }

        System.out.println(sec);
    }

    private static int getDialTime(char c) {
        char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        int[] time = {3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 10, 10, 10, 10};

        for (int i = 0; i < alphabet.length; i++) {
            if (c == alphabet[i]) {
                return time[i];
            }
        }

        return 0;
    }
}