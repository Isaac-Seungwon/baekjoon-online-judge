package S5_11723_집합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(br.readLine()); // 연산의 수
        boolean[] set = new boolean[21]; // 집합을 나타내는 배열 (인덱스 1부터 사용)

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            String[] operation = br.readLine().split(" ");

            switch (operation[0]) {
                case "add":
                    add(set, Integer.parseInt(operation[1]));
                    break;
                case "remove":
                    remove(set, Integer.parseInt(operation[1]));
                    break;
                case "check":
                    sb.append(check(set, Integer.parseInt(operation[1]))).append('\n');
                    break;
                case "toggle":
                    toggle(set, Integer.parseInt(operation[1]));
                    break;
                case "all":
                    all(set);
                    break;
                case "empty":
                    empty(set);
                    break;
            }
        }

        System.out.println(sb);
    }

    static void add(boolean[] set, int x) {
        set[x] = true;
    }

    static void remove(boolean[] set, int x) {
        set[x] = false;
    }

    static int check(boolean[] set, int x) {
        return set[x] ? 1 : 0;
    }

    static void toggle(boolean[] set, int x) {
        set[x] = !set[x];
    }

    static void all(boolean[] set) {
        for (int i = 1; i <= 20; i++) {
            set[i] = true;
        }
    }

    static void empty(boolean[] set) {
        for (int i = 1; i <= 20; i++) {
            set[i] = false;
        }
    }
}
