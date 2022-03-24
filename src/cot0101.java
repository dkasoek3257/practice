import java.util.Scanner;

public class cot0101 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String s=sc.next();
        String[] arr =str.split("");
        int cnt=0;
        for (String value : arr) {
            if (value.equalsIgnoreCase(s)) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
