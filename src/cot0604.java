import java.util.Scanner;

public class cot0604 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] cas = new int[s];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int x : arr) {
            int pos = -1;
            for (int i = 0; i < s; i++) if (x == cas[i]) pos = i;
            if (pos == -1) {
                for (int i = s - 1; i >= 1; i--) {
                    cas[i] = cas[i - 1];
                }
            } else {
                for (int i = pos; i >= 1; i--) {
                    cas[i] = cas[i - 1];
                }
            }
            cas[0] = x;
        }


        for (int i = 0; i < s; i++) {
            System.out.print(cas[i] + " ");
        }
    }
}
