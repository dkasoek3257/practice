import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class cot0507 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String cl = sc.nextLine();
        String answer="YES";
        Queue<Character> Q = new LinkedList<>();

        for (char x : str.toCharArray()) Q.offer(x);

        for (char x : cl.toCharArray()) {
            if (Q.contains(x)) {
                if (x != Q.poll()) {
                    answer = "NO";
                }
            }
        }
        if(!Q.isEmpty())answer="NO";

        System.out.println(answer);
    }
}
