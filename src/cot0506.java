import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class cot0506 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int answer=0;
        Queue<Integer> qu = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            qu.offer(i);
        }
        while(!qu.isEmpty()){
            for(int i=1;i<k; i++) qu.offer(qu.poll());
            qu.poll();
            if(qu.size()==1)answer=qu.poll();
        }
        System.out.println(answer);
    }
}

