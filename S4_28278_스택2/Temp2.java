package S4_28278_스택2;

import java.util.Stack;

public class Temp2 {

	public static void main(String[] args) throws Exception {
		Stack<Integer> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		int n = read();

		for (int i = 0; i < n; i++) {
			int order = read();

			int x = 0;
			if (order == 1) {
				x = read(); // 명령이 1인 경우 정수를 입력
			}

			switch (order) {
			case 1:
				// 1 X: 정수 X를 스택에 넣음
				stack.push(x);
				break;
			case 2:
				// 2: 스택에서 맨 위의 정수를 빼고 출력, 스택이 비어있으면 -1 출력
				sb.append(!stack.isEmpty() ? stack.pop() : -1).append('\n');
				break;
			case 3:
				// 3: 스택에 들어있는 정수의 개수를 출력
				sb.append(stack.size()).append('\n');
				break;
			case 4:
				// 4: 스택이 비어있으면 1, 아니면 0을 출력
				sb.append(stack.isEmpty() ? 1 : 0).append('\n');
				break;
			case 5:
				// 5: 스택이 비어있으면 -1을 출력, 아니면 맨 위의 정수 출력
				sb.append(!stack.isEmpty() ? stack.peek() : -1).append('\n');
				break;
			}
		}

		System.out.println(sb);
	}

	private static int read() throws Exception {
		int c, n = System.in.read() & 15; // 초기값

		while ((c = System.in.read()) > 32)
			n = (n << 3) + (n << 1) + (c & 15); // 숫자를 읽어와서 정수로 변환
		if (c == 13)
			System.in.read(); // 개행 문자('\r')가 나오면 다음 문자를 읽음

		return n; // 읽은 정수 반환
	}

}
