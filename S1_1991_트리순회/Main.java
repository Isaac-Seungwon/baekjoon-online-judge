package S1_1991_트리순회;

import java.io.*;

public class Main {
	static int N; // 노드 개수
	static Node root = new Node('A', null, null); // 루트 노드(A)

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine()); // 노드 개수 입력

		// 노드를 입력받아 트리에 노드 삽입
		for (int i = 0; i < N; i++) {
			String[] input = br.readLine().split(" ");
			char nodeValue = input[0].charAt(0); // 현재 노드의 값
			char leftChildValue = input[1].charAt(0); // 왼쪽 자식 노드의 값
			char rightChildValue = input[2].charAt(0); // 오른쪽 자식 노드의 값
			insertNode(root, nodeValue, leftChildValue, rightChildValue); // 노드 삽입
		}

		// 전위 순회
		preOrder(root);
		System.out.println();

		// 중위 순회
		inOrder(root);
		System.out.println();

		// 후외 순회
		postOrder(root);
	}

	// 이진 트리 노드 클래스
	static class Node {
		char value; // 노드 값
		Node left; // 왼쪽 자식 노드
		Node right; // 오른쪽 자식 노드

		Node(char value, Node left, Node right) {
			this.value = value;
			this.left = left;
			this.right = right;
		}
	}

	// 이진 트리에 노드 삽입
	static void insertNode(Node node, char nodeValue, char leftChildValue, char rightChildValue) {
		if (node == null) {
			return;
		}

		// 현재 노드의 값이 입력받은 노드 값과 일치하면 왼쪽과 오른쪽 자식 노드를 삽입
		if (node.value == nodeValue) {
			node.left = (leftChildValue == '.' ? null : new Node(leftChildValue, null, null)); // 왼쪽 자식 노드 삽입
			node.right = (rightChildValue == '.' ? null : new Node(rightChildValue, null, null)); // 오른쪽 자식 노드 삽입
		} else { // 현재 노드의 값이 입력받은 노드 값과 일치하지 않으면 왼쪽과 오른쪽 자식 노드로 재귀 호출하여 노드 삽입
			insertNode(node.left, nodeValue, leftChildValue, rightChildValue);
			insertNode(node.right, nodeValue, leftChildValue, rightChildValue);
		}
	}

	// 전위 순회: 뿌리(root)를 먼저 방문
	static void preOrder(Node node) {
		if (node == null) {
			return;
		}

		System.out.print(node.value);
		preOrder(node.left);
		preOrder(node.right);
	}

	// 중위 순회: 왼쪽 하위 트리를 방문 후 뿌리(root)를 방문
	static void inOrder(Node node) {
		if (node == null) {
			return;
		}

		inOrder(node.left);
		System.out.print(node.value);
		inOrder(node.right);
	}

	// 후위 순회: 하위 트리 모두 방문 후 뿌리(root)를 방문
	static void postOrder(Node node) {
		if (node == null) {
			return;
		}

		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.value);
	}
}