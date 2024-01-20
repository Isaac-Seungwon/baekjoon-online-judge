package S5_10431_줄세우기;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int P = scanner.nextInt(); // 테스트 케이스의 개수

        // 후위 감소 연산자(--)를 사용하여 P의 값을 1씩 감소시키면서, 감소된 값이 0보다 큰 동안에만 반복
        while (P-- > 0) {
            int T = scanner.nextInt(); // 테스트 케이스 번호
            int[] heights = new int[20]; // 학생들의 키
            for (int i = 0; i < 20; i++) {
                heights[i] = scanner.nextInt();
            }

            int totalSteps = 0; // 뒤로 물러난 걸음 수
            for (int i = 1; i < 20; i++) {
                for (int j = 0; j < i; j++) {
                    if (heights[j] > heights[i]) {
                        totalSteps++;
                    }
                }
            }

            System.out.println(T + " " + totalSteps);
        }

        scanner.close();
    }
}
