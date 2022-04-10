import java.util.HashMap;
import java.util.Scanner;

public class cot0402 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String answer="";
        HashMap<Character, Integer> map = new HashMap<>();
        a = a.toUpperCase();
        b = b.toUpperCase();

        for (char x : a.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        for (char x : b.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) - 1);
        }

        for (char x : map.keySet()) {
            if (map.get(x) != 0) {
                answer="NO";
                break;
            }else answer="YES";
        }
        System.out.println(answer);
    }
}
