import java.util.Scanner;

public class greedy_3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s=sc.next();
        int cnt0=0;
        int cnt1=0;

        if(s.charAt(0)=='1')
            cnt1+=1;
        else
            cnt0+=1;

        for(int i=0; i<s.length()-1;i++){
            if(s.charAt(i)!=s.charAt(i+1))
                if(s.charAt(i+1)=='1')cnt1+=1;
                else cnt0+=1;
        }
        System.out.println(Math.min(cnt0,cnt1));
    }
}
