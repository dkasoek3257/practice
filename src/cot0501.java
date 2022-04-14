import java.util.Scanner;
import java.util.Stack;

public class cot0501 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        Stack<Character> st = new Stack<>();
        String answer="YES";
        for (char i : s.toCharArray()) {
            if (i == '(') st.push(i);
            else {
                if(st.empty()) {answer="NO";break;}
                st.pop();
            }
        }
        if(!st.isEmpty())answer="NO";
        System.out.println(answer);
    }
}
