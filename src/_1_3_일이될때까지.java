import java.util.Scanner;

public class _1_3_일이될때까지 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int cnt = 0;

		while (N > 1) {
			if (N % K == 0) {
				N = N / K;
				cnt++;
			} else {
				N = N - 1;
				cnt++;
			}
			if (N == 1)
				break;
		}

		System.out.println(cnt);
	}

}
