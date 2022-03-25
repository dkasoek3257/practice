import java.util.Scanner;

public class cot0105 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] s = str.toCharArray();
        int start = 0;
        int end = s.length - 1;
        while (start < end) {
            if (!Character.isAlphabetic(s[start])) {
                start++;
            } else if (!Character.isAlphabetic(s[end])) {
                end--;
            } else {
                char tmp = s[start];
                s[start] = s[end];
                s[end] = tmp;
                start++;
                end--;
            }
        }
        for (char x : s) {
            System.out.print(x);
        }
    }
}
