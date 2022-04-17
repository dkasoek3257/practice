import java.util.Scanner;
import java.util.Stack;

public class cot0504 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Stack<Integer> st = new Stack<>();
        for (char x : str.toCharArray()) {
            if (Character.isDigit(x)) st.push(x -'0');
            else {
                int rt = st.pop();
                int lt = st.pop();
                if (x == '+')st.push(lt+rt);
                    else if (x == '-')st.push(lt-rt);
                    else if (x == '*')st.push(lt*rt);
                    else if (x == '/')st.push(lt/rt);
            }
        }
        int answer=st.get(0);
        System.out.println(answer);
    }
}
