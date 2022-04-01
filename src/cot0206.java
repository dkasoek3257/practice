import java.util.ArrayList;
import java.util.Scanner;

public class cot0206 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0; i<n; i++) {
            arr[i]=sc.nextInt();
        }

        ArrayList<Integer> answer=new ArrayList<>();
        for(int i=0; i<n; i++){
            int tmp=arr[i];
            int res=0;
            while(tmp>0){
                int t=tmp%10;
                res=res*10+t;
                tmp=tmp/10;
            }
            if(isPrime(res))answer.add(res);
        }
        for (Integer integer : answer) {
            System.out.print(integer + " ");
        }
    }

    private static boolean isPrime(int num) {
        if(num==1)return false;
        for(int i=2; i<num; i++){
            if(num%i==0)return false;
        }
        return true;
    }
}
