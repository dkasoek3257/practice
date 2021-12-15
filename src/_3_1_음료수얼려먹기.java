import java.util.Scanner;

public class _3_1_음료수얼려먹기 {
	static int[][] arr = new int[50][50];
	static int N, M;

	static boolean dfs(int x, int y) {
		if (x <= -1 || x >= N || y <= -1 || y >= M) // 주어진 범위 아니면 종료
			return false;
		
		if (arr[x][y] == 0) { // 노드방문안했으면 1 바꾸고 재귀 호출
			arr[x][y] = 1;
			dfs(x - 1, y);
			dfs(x + 1, y);
			dfs(x, y + 1);
			dfs(x, y - 1);
			return true;
		}
		
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();

		for (int i = 0; i < N; i++) { // 음료수틀 입력
			for (int j = 0; j < M; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int result = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (dfs(i, j)) {
					result += 1;
				}
			}
		}
		System.out.println(result);

	}
}
