import java.util.Arrays;
import java.util.Scanner;

public class cot0605 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        String answer = "U";
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);


//        for (int i = 0; i < n; i++) {
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();


        for (int i = 0; i < n-1; i++) {
            if (arr[i] == arr[i + 1]) {
                answer = "D";
                break;
            }
        }
        System.out.println(answer);
    }
}
