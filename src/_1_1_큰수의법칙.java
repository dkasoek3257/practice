import java.util.Arrays;
import java.util.Scanner;

public class _1_1_ū���ǹ�Ģ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // ������ ����
		int M = sc.nextInt(); // �迭�� ����
		int K = sc.nextInt(); // �����ؼ� �ü��ִ� Ƚ��
		int[] num = new int[N];
		for (int i = 0; i < N; i++) {
			num[i] = sc.nextInt();
		}

		Arrays.sort(num);
		int sum = 0;
		int Max = num[N - 1];
		int tMax = num[N - 2];

		int[] arr = new int[M];
		int cnt = 1;
		for (int i = 0; i < M; i++) {
			if (cnt == K) {
				cnt = 1;
				arr[i] = tMax;
				continue;
			}
			arr[i] = Max;
			cnt++;
		}
		for(int i=0; i<M;i++) {
			sum+=arr[i];
		}
		System.out.println(sum);
	}

}
