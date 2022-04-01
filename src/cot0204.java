import java.util.Scanner;

public class cot0204 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]dp=new int[n];
        dp[0]=1;
        dp[1]=1;
        String answer=dp[0]+" "+dp[1]+" ";
        for(int i=2; i<n; i++){
            dp[i]=dp[i-1]+dp[i-2];
        answer+=dp[i]+" ";
        }
        System.out.println(answer);
    }
}
