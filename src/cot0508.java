import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class cot0508 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int answer = 0;
        Queue<person> Q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            Q.offer(new person(i, arr[i]));
        }
        while (!Q.isEmpty()) {
            person tmp = Q.poll();
            for (person x : Q) {
                if (x.pri > tmp.pri) {
                    Q.offer(tmp);
                    tmp = null;
                    break;
                }
            }
            if (tmp != null) {
                answer++;
                if (tmp.id == m) System.out.println(answer);
            }
        }
    }
}

class person {
    int id;
    int pri;
    public person(int id, int pri) {
        this.id = id;
        this.pri = pri;
    }
}