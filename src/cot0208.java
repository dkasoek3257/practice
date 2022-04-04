import java.util.Scanner;

public class cot0208 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] rank = new int[n];
        String answer = "";
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int cnt = 1;
            for (int j = 0; j < n; j++) {
                if (arr[i] < arr[j]) cnt++;
            }
            rank[i] = cnt;
        }

        for (int i = 0; i < rank.length; i++) {
            answer += rank[i] + " ";
        }
        System.out.println(answer);
    }
}
