import java.util.Arrays;
import java.util.Scanner;

public class greedy_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();  //동전개수
        int[] coin = new int[N];
        for (int i = 0; i < N; i++) { // 동전 가격
            coin[i] = sc.nextInt();
        }
        Arrays.sort(coin);
        int target = 1;
        for (int i : coin) {    //target보다 다음코인이 크면 그 target은 만들수 없다.
                                // target이 만들수 없는 최솟값이 된다.
            if (target < i) {
                System.out.println(target);
                break;
            }
            target += i;
        }
    }
}
