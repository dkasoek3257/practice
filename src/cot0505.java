import java.util.Scanner;
import java.util.Stack;

public class cot0505 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        Stack<Character> st = new Stack<>();
        int answer = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='(')st.push('(');
            else{
                st.pop();
                if(str.charAt(i-1)=='(')answer+=st.size();
                else answer++;
            }
        }
        System.out.println(answer);
    }
}
