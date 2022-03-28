import java.util.Scanner;

public class cot0110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        String[] str = s.split("");
        int[] arr = new int[str.length];
        int p = 1000;
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals(t)) {
                p = 0;
            } else {
                p++;
            }
            arr[i] = p;
        }
        p = 1000;
        for (int i = str.length - 1; i >= 0; i--) {
            if (str[i].equals(t)) {
                p = 0;
            } else {
                p++;
                arr[i] = Math.min(arr[i], p);
            }
        }

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
