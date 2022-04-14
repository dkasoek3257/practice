import java.util.Scanner;
import java.util.Stack;

public class cot0503 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int m = sc.nextInt();
        int[] mov = new int[m];
        for (int i = 0; i < m; i++) {
            mov[i] = sc.nextInt();
        }

        Stack<Integer> st = new Stack<>();
        int answer = 0;

        for (int i : mov) {
            for (int k = 0; k < arr.length; k++) {
                if (arr[k][i - 1] != 0) {
                    if (!st.isEmpty() && arr[k][i - 1] == st.peek()) {
                        answer += 2;
                        st.pop();
                    } else st.push(arr[k][i - 1]);

                        arr[k][i - 1] = 0;
                        break;

                }
            }
        }
        System.out.println(answer);
    }
}
