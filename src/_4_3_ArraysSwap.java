import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class _4_3_ArraysSwap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        Integer[] A = new Integer[N];
        System.out.println("A");
        for (int i = 0; i < N; i++) { //A 배열 입력
            A[i] = sc.nextInt();
        }


        Integer[] B = new Integer[N];
        System.out.println("B");
        for (int i = 0; i < N; i++) { // B 배열 입력
            B[i] = sc.nextInt();
        }

        Arrays.sort(A); //정렬
        Arrays.sort(B, Collections.reverseOrder());

        for (int i = 0; i < K; i++) { //스왑
            if (A[i] < B[i]) {
                int temp = A[i];
                A[i] = B[i];
                B[i] = temp;
            } else break;
        }

        int sum = 0;
        for (int i = 0; i < N; i++) { //합
            sum += A[i];
        }
        System.out.println(sum);
    }
}
