import java.util.Scanner;

public class cot0108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.toLowerCase().replaceAll("[^a-z]", "");
        String tmp = new StringBuilder(s).reverse().toString();
        String answer ;
        if (s.equals(tmp)) answer = "YES";
        else{
            answer="NO";
        }
        System.out.println(answer);
    }
}
