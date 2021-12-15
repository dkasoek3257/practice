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

public class _3_2_미로탈출 {
	static int N, M;
	static int[][] arr = new int[100][100];
	static int dx[] = { -1, 1, 0, 0 };// 상 하 좌 우
	static int dy[] = { 0, 0, -1, 1 };
	static int count = 0;
	static int nx, ny;

	static int bfs(int x, int y) {
		Queue<Node> q = new LinkedList<>();
		q.offer(new Node(x, y)); // 큐에 넣기
		
		
		while (!q.isEmpty()) {
			Node node = q.poll(); // 큐에서 반환하기
			x = node.getX(); // 반환한 큐의 x값 x에 저장
			y = node.getY(); // 반환한 큐의 y값 y에 저장

			for (int i = 0; i < 4; i++) { // 방향 체크
				nx = x + dx[i];
				ny = y + dy[i];
				if (nx < 0 || nx >= N || ny < 0 || ny >= M) // 벽 무시
					continue;
				if (arr[nx][ny] == 0) // 괴물 있으면 무시
					continue;
				if (arr[nx][ny] == 1) { // 처음 가는 길 1을 2로 바꾸기
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
		N = sc.nextInt(); // 미로 크기
		M = sc.nextInt(); // 미로 크기

		for (int i = 0; i < N; i++) { // 미로 입력
			for (int j = 0; j < M; j++)
				arr[i][j] = sc.nextInt();
		}

		System.out.println(bfs(1, 1));

	}

}
