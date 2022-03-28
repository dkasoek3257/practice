import java.util.Scanner;

public class cot0109 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String answer = "";
        String[] str = s.split("");
        for (String x : str) {
                if('0'<=x.charAt(0)&&x.charAt(0)<='9')
                    answer+=x.charAt(0);
        }
        int result=Integer.parseInt(answer);
        System.out.println(result);
    }
}
