package S5_11723_집합;

import java.io.DataInputStream;
import java.io.IOException;

public class Temp1 {
    static class Reader {
        final private int BUFFER_SIZE = 1 << 16;
        private DataInputStream din;
        private byte[] buffer;
        private int bufferPointer, bytesRead;

        public Reader() {
            din = new DataInputStream(System.in);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public int nextInt() throws IOException {
            int ret = 0;
            byte c = read();
            while (c <= ' ') {
                c = read();
            }
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');

            return neg ? -ret : ret;
        }

        private void fillBuffer() throws IOException {
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
            if (bytesRead == -1)
                buffer[0] = -1;
        }

        private byte read() throws IOException {
            if (bufferPointer == bytesRead)
                fillBuffer();
            return buffer[bufferPointer++];
        }

        public void close() throws IOException {
            if (din != null)
                din.close();
        }
    }

    public static void main(String[] args) throws IOException {
        Reader in = new Reader();
        StringBuilder out = new StringBuilder();

        int M = in.nextInt();
        int bit = 0, cnt = 0;

        while (M-- > 0) {
            char operation = (char) in.read();
            switch (operation) {
                case 'a':
                    if (in.read() == 'd') {
                        in.read();
                        bit |= 1 << in.nextInt() - 1;
                    } else {
                        in.read(); in.read();
                        bit = (1 << 20) - 1;
                    }
                    break;
                case 'r':
                    in.read(); in.read(); in.read(); in.read(); in.read();
                    bit &= ~(1 << in.nextInt() - 1);
                    break;
                case 'c':
                    in.read(); in.read(); in.read(); in.read();
                    out.append((bit & 1 << in.nextInt() - 1) != 0 ? 1 : 0).append('\n');
                    if (++cnt == 100000) {
                        cnt = 0;
                        System.out.print(out);
                        out.setLength(0);
                    }
                    break;
                case 't':
                    in.read(); in.read(); in.read(); in.read(); in.read();
                    bit ^= 1 << in.nextInt() - 1;
                    break;
                default:
                    in.read(); in.read(); in.read(); in.read(); in.read();
                    bit = 0;
                    break;
            }
        }

        System.out.print(out);
        in.close();
    }
}
