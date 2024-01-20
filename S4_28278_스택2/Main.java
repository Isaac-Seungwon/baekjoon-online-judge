package S4_28278_스택2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 입력을 위한 BufferedReader
		StringBuilder sb = new StringBuilder(); // 출력 결과 저장을 위한 StringBuilder 객체
		Stack<Integer> stack = new Stack<Integer>(); // 정수를 저장할 스택
		StringTokenizer st; // StringTokenizer를 사용하여 문자열을 토큰으로 분리하기 위한 객체
		int N = Integer.parseInt(br.readLine()); // 명령의 개수

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine()); // 한 줄씩 명령을 입력 받아서 StringTokenizer를 통해 명령과 값 분리
			String command = st.nextToken();

			if (command.equals("1")) // "1 X": 정수 X를 스택에 넣음
				stack.push(Integer.parseInt(st.nextToken()));
			else if (command.equals("2")) { // "2": 스택에서 맨 위의 정수를 빼고 출력, 스택이 비어있으면 -1 출력
				if (!stack.isEmpty()) {
					sb.append(stack.lastElement()).append("\n");
					stack.pop();
				} else
					sb.append(-1).append("\n");
			} else if (command.equals("3")) // "3": 스택에 들어있는 정수의 개수를 출력
				sb.append(stack.size()).append("\n");
			else if (command.equals("4")) // "4": 스택이 비어있으면 1, 아니면 0을 출력
				if (stack.isEmpty())
					sb.append(1).append("\n");
				else
					sb.append(0).append("\n");
			else if (command.equals("5")) // "5": 스택이 비어있으면 -1을 출력, 아니면 맨 위의 정수 출력
				if (stack.isEmpty())
					sb.append(-1).append("\n");
				else
					sb.append(stack.lastElement()).append("\n");
		}

		br.close();
		System.out.println(sb);
	}
}
