import java.util.Scanner;

public class cot0201 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        String answer=""+arr[0]+" ";
        for (int x =0; x < n-1; x++) {
            if (arr[x] < arr[x+1]) {
                answer += arr[x+1] + " ";
            }
        }
        System.out.println(answer);
    }

}
