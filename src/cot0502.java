import java.util.Scanner;
import java.util.Stack;

public class cot0502 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        Stack<Character>st=new Stack<>();
        String answer="";
        for(char i:str.toCharArray()){
            if(i==')'){
                while(st.pop()!='(');
            }
            else st.push(i);
        }
        for(int i=0; i<st.size();i++){
            answer+=st.get(i);
        }
        System.out.println(answer);
    }
}
