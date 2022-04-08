import java.util.Scanner;

public class cot0305 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = 0;
        int [] arr=new int[n/2+1];
        for(int i=0; i<n/2+1; i++)arr[i]=i+1;

        int sum=0;
        int lt=0;
        for(int rt=0; rt<n/2+1; rt++){
            sum+=arr[rt];
            if(sum==n)answer++;
            while(sum>=n){
                sum-=arr[lt];
                lt++;
                if(sum==n)answer++;
            }
        }
        System.out.println(answer);
    }
}
