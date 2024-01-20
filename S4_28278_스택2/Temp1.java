public class Temp1 {
    public static void main(String[] args) throws Exception {
        // Reader 객체를 생성하여 입력을 처리하고, 결과를 저장할 StringBuilder 객체 생성
        Reader in = new Reader();
        StringBuilder sb = new StringBuilder();
        final int MAX = 1_000_000;

        // 입력으로 주어지는 명령의 수
        int n = in.nextInt();
        // 명령에 따라 값을 저장할 스택 배열과 스택 포인터
        int[] stack = new int[MAX];
        int ptr = -1;

        // 명령의 수만큼 루프를 돌면서 명령을 처리
        while (n-- > 0) {
            // 명령을 읽음
            int order = in.nextInt();
            // 명령에 따라 스택 조작
            switch (order) {
                case 1:
                    // 1 X: 정수 X를 스택에 넣음
                    stack[++ptr] = in.nextInt();
                    break;

                case 2:
                    // 2: 스택에서 맨 위의 정수를 빼고 출력, 스택이 비어있으면 -1 출력
                    if (ptr >= 0)
                        sb.append(stack[ptr--]).append('\n');
                    else
                        sb.append(-1).append('\n');
                    break;

                case 3:
                    // 3: 스택에 들어있는 정수의 개수를 출력
                    sb.append(ptr + 1).append('\n');
                    break;

                case 4:
                    // 4: 스택이 비어있으면 1, 아니면 0을 출력
                    if (ptr >= 0)
                        sb.append(0).append('\n');
                    else
                        sb.append(1).append('\n');
                    break;

                case 5:
                    // 5: 스택이 비어있으면 -1을 출력, 아니면 맨 위의 정수 출력
                    if (ptr >= 0)
                        sb.append(stack[ptr]).append('\n');
                    else
                        sb.append(-1).append('\n');
                    break;
            }
        }

        // 결과 출력
        System.out.print(sb);
    }
}

// Reader 클래스 정의
class Reader {
    final int SIZE = 1 << 13;
    byte[] buffer = new byte[SIZE];
    int index, size;

    char nextChar() throws Exception {
        char ch = ' ';
        byte c;
        while ((c = read()) <= 32);
        do
            ch = (char) c;
        while (isAlphabet(c = read()));
        return ch;
    }

    int nextInt() throws Exception {
        int n = 0;
        byte c;
        boolean isMinus = false;
        while ((c = read()) <= 32);
        if (c == 45) {
            c = read();
            isMinus = true;
        }
        do
            n = (n << 3) + (n << 1) + (c & 15);
        while (isNumber(c = read()));
        return isMinus ? ~n + 1 : n;
    }

    long nextLong() throws Exception {
        long n = 0;
        byte c;
        boolean isMinus = false;
        while ((c = read()) <= 32);
        if (c == 45) {
            c = read();
            isMinus = true;
        }
        do
            n = (n << 3) + (n << 1) + (c & 15);
        while (isNumber(c = read()));
        return isMinus ? ~n + 1 : n;
    }

    double nextDouble() throws Exception {
        double n = 0, div = 1;
        byte c;
        boolean isMinus = false;
        while ((c = read()) <= 32);
        if (c == 45) {
            c = read();
            isMinus = true;
        } else if (c == 46) {
            c = read();
        }
        do
            n = (n * 10) + (c & 15);
        while (isNumber(c = read()));
        if (c == 46) {
            while (isNumber(c = read())) {
                n += (c - 48) / (div *= 10);
            }
        }
        return isMinus ? -n : n;
    }

    boolean isNumber(byte c) {
        return 47 < c && c < 58;
    }

    boolean isAlphabet(byte c) {
        return 96 < c && c < 123;
    }

    byte read() throws Exception {
        if (index == size) {
            size = System.in.read(buffer, index = 0, SIZE);
            if (size < 0)
                buffer[0] = -1;
        }
        return buffer[index++];
    }
}
