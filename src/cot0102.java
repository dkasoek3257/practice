import java.util.Scanner;

public class cot0102 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] s = str.split("");

        for (int i = 0; i < s.length; i++) {
            if (Character.isLowerCase(s[i].charAt(0))) {
                s[i] = s[i].toUpperCase();
            } else
                s[i] = s[i].toLowerCase();
        }
        for (String value : s) {
            System.out.print(value);
        }
    }
}
