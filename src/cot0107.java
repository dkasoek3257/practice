import java.util.Scanner;

public class cot0107 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String str=s.toLowerCase();
        int lt = 0;
        int rt = str.length() - 1;
        int cnt=0;
        while(lt<rt){
            if(str.charAt(lt)==str.charAt(rt)){
                cnt++;
            }
            lt++;
            rt--;
        }
        if(cnt==(str.length()/2))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
