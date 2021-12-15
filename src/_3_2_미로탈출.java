import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node {

	private int x;
	private int y;

	public Node(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}
}

public class _3_2_�̷�Ż�� {
	static int N, M;
	static int[][] arr = new int[100][100];
	static int dx[] = { -1, 1, 0, 0 };// �� �� �� ��
	static int dy[] = { 0, 0, -1, 1 };
	static int count = 0;
	static int nx, ny;

	static int bfs(int x, int y) {
		Queue<Node> q = new LinkedList<>();
		q.offer(new Node(x, y)); // ť�� �ֱ�
		
		
		while (!q.isEmpty()) {
			Node node = q.poll(); // ť���� ��ȯ�ϱ�
			x = node.getX(); // ��ȯ�� ť�� x�� x�� ����
			y = node.getY(); // ��ȯ�� ť�� y�� y�� ����

			for (int i = 0; i < 4; i++) { // ���� üũ
				nx = x + dx[i];
				ny = y + dy[i];
				if (nx < 0 || nx >= N || ny < 0 || ny >= M) // �� ����
					continue;
				if (arr[nx][ny] == 0) // ���� ������ ����
					continue;
				if (arr[nx][ny] == 1) { // ó�� ���� �� 1�� 2�� �ٲٱ�
					arr[nx][ny] += 1;
					q.offer(new Node(nx,ny));
				}
			}

		}
		return arr[N - 1][M - 1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt(); // �̷� ũ��
		M = sc.nextInt(); // �̷� ũ��

		for (int i = 0; i < N; i++) { // �̷� �Է�
			for (int j = 0; j < M; j++)
				arr[i][j] = sc.nextInt();
		}

		System.out.println(bfs(1, 1));

	}

}
