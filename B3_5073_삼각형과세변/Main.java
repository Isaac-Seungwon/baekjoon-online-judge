package B3_5073_삼각형과세변;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            // 종료 조건
            if (a == 0 && b == 0 && c == 0)
                break;

            // 삼각형의 유형 판별
            String result = checkTriangleType(a, b, c);
            System.out.println(result);
        }
    }

    // 삼각형의 성립 여부 확인
    private static boolean isInvalidTriangle(int a, int b, int c) {
        return (a >= b + c) || (b >= a + c) || (c >= a + b);
    }

    // 삼각형의 유형 판별
    private static String checkTriangleType(int a, int b, int c) {
        if (isInvalidTriangle(a, b, c))
            return "Invalid";
        else if (a == b && b == c)
            return "Equilateral"; // 정삼각형
        else if ((a == b) || (a == c) || (b == c))
            return "Isosceles"; // 이등변삼각형
        else
            return "Scalene"; // 삼각형
    }
}
