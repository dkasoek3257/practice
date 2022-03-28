import java.util.Scanner;

public class cot0112 {
    public static void main(String[] args) {
        // # 1
        // * 0
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String str = sc.next();
       int result;
       String answer="";
        str=str.replaceAll("#", "1");
        str=str.replaceAll("\\*", "0");

        for(int i=0; i<str.length();i+=7) {
            String s=str.substring(i,i+7);
            result=Integer.valueOf(s,2);
            answer+=(char)result;
        }
        System.out.println(answer);
    }
}
