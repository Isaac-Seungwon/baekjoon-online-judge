package S4_1018_체스판다시칠하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력 받기
        String[] NM = br.readLine().split(" ");
        int N = Integer.parseInt(NM[0]);
        int M = Integer.parseInt(NM[1]);

        // 보드 입력받기
        char[][] board = new char[N][M];
        for (int i = 0; i < N; i++) {
            board[i] = br.readLine().toCharArray();
        }

        // 최소 다시 칠해야 하는 정사각형 개수 계산
        int minRepaint = calculateMinRepaint(N, M, board);

        // 결과 출력
        System.out.println(minRepaint);
    }

    private static int calculateMinRepaint(int N, int M, char[][] board) {
        int minRepaint = Integer.MAX_VALUE;

        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                int repaintCount = getRepaintCount(i, j, board);
                minRepaint = Math.min(minRepaint, repaintCount);
            }
        }

        return minRepaint;
    }

    private static int getRepaintCount(int row, int col, char[][] board) {
        int repaintCount = 0;
        char startColor = board[row][col];

        for (int i = row; i < row + 8; i++) {
            for (int j = col; j < col + 8; j++) {
                // 현재 위치의 색이 시작 색과 다르면 다시 칠해야 함
                if (board[i][j] != startColor) {
                    repaintCount++;
                }

                // 다음 칸의 시작 색을 결정
                startColor = (startColor == 'W') ? 'B' : 'W';
            }

            // 다음 행의 시작 색을 결정
            startColor = (startColor == 'W') ? 'B' : 'W';
        }

        // 최소값 반환
        return Math.min(repaintCount, 64 - repaintCount);
    }
}
