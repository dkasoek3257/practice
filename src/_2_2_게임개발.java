import java.util.*;

public class _2_2_���Ӱ��� {
	public static int N, M, X, Y, dir;
	public static int arr[][] = new int[50][50]; // �޾ƿ�
	public static int visited[][] = new int[50][50]; // �湮üũ
	public static int[] dx = { -1, 0, 1, 0 }; // �� �� �� ��
	public static int[] dy = { 0, 1, 0, -1 };

	public static void turn() {
		dir -= 1;
		if (dir == -1)
			dir = 3;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();// ����
		M = sc.nextInt();// ������Ŭ���� �ܼ� �α� ����

		X = sc.nextInt(); // ������
		Y = sc.nextInt(); // ������

		dir = sc.nextInt(); // ���۽� ���� �ִ� ����
		visited[X][Y] = 1;
		System.out.println("�ٴ�/���� �Է�");
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int count = 1;
		int turntime = 0;
		while (true) {
			turn();
			int Nx = X + dx[dir];
			int Ny = Y + dy[dir];
			if (arr[Nx][Ny] == 0 && visited[Nx][Ny] == 0) { // ����
				visited[Nx][Ny]=1;
				X = Nx;
				Y = Ny;
				count += 1;
				turntime = 0;
				continue;
			} else {
				turntime += 1;
			}
			if (turntime == 4) {
				Nx = X - dx[dir];
				Ny = Y - dy[dir];
				if (arr[Nx][Ny] == 0) {
					X = Nx;
					Y = Ny;
				} else
					break;
				turntime = 0;
			}
		}

		System.out.println(count);
	}
}
