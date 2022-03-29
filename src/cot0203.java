import java.util.Scanner;

public class cot0203 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        String answer = "";
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (a[i] == b[i]) {
                answer += "D" + "\n";
            } else if (a[i] == 1) {
                if (b[i]==3)answer += "A" + "\n";
                if (b[i]==2)answer += "B" + "\n";
            }else if (a[i] == 2) {
                if (b[i]==1)answer += "A" + "\n";
                if (b[i]==3)answer += "B" + "\n";
            }
            else if (a[i] == 3) {
                if (b[i]==1)answer += "B" + "\n";
                if (b[i]==2)answer += "A" + "\n";
            }
        }
        System.out.println(answer);
    }
}
