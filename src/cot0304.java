import java.util.Scanner;

public class cot0304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0,lt = 0,answer=0;


       for(int rt=0; rt<n; rt++){
            sum+=arr[rt];
            if(sum==m)answer++;
            while(sum>=m){
                sum-=arr[lt++];
                if(sum==m)answer++;
            }
        }
        System.out.println(answer);
    }
}
