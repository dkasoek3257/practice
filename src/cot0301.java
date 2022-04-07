import java.util.ArrayList;
import java.util.Scanner;

public class cot0301 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] an = new int[n];
        for (int i = 0; i < n; i++) {
            an[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] am = new int[m];
        for (int i = 0; i < m; i++) {
            am[i] = sc.nextInt();
        }

        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0, p2 = 0;
        while (p1 < n && p2 < m) {
            if (an[p1] < am[p2]) {
                answer.add(an[p1++]);
            } else {
                answer.add(am[p2++]);
            }
        }
        while (p1 < n) answer.add(an[p1++]);
        while (p2 < m) answer.add(am[p2++]);

        for (int i = 0; i < answer.size(); i++) {
            System.out.print(answer.get(i));
            System.out.print(" ");
        }
    }
}
