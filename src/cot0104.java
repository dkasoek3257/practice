import java.util.Scanner;

public class cot0104 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] result = new String[n];
        for (int j = 0; j < n; j++) {
            String str = sc.next();
            String[] s = str.split("");
            for (int i = 0; i < str.length() / 2; i++) {
                String swap = s[i];
                s[i] = s[str.length() - 1 - i];
                s[str.length() - 1 - i] = swap;
            }
            for(int i=0; i<str.length()-1; i++){
                s[0]+=s[i+1];
                result[j]=s[0];
            }
        }
        for(String x:result){
            System.out.println(x);
        }
    }
}