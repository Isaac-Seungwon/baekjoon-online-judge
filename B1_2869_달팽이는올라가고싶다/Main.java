package B1_2869_달팽이는올라가고싶다;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt(); // 낮에 올라가는 높이
        int B = scan.nextInt(); // 밤에 미끄러지는 높이
        int V = scan.nextInt(); // 나무의 높이
        int days = (V - B - 1) / (A - B) + 1;
        System.out.println(days);
    }
}
