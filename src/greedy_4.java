import java.util.Arrays;
import java.util.Scanner;

public class greedy_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();  //��������
        int[] coin = new int[N];
        for (int i = 0; i < N; i++) { // ���� ����
            coin[i] = sc.nextInt();
        }
        Arrays.sort(coin);
        int target = 1;
        for (int i : coin) {    //target���� ���������� ũ�� �� target�� ����� ����.
                                // target�� ����� ���� �ּڰ��� �ȴ�.
            if (target < i) {
                System.out.println(target);
                break;
            }
            target += i;
        }
    }
}
