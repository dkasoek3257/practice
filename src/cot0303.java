import java.util.Scanner;

public class cot0303 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

//        //time limit
//        int answer = 0;
//        int sum = 0, p = 0;
//        while (p < n - k) {
//            for (int i = 0; i < k; i++) {
//                sum += arr[p+i];
//            }
//            answer = Math.max(answer,sum);
//            sum=0;
//            p++;
//        }

        int sum=0;int answer=0;
        for(int i=0; i<k; i++){
            sum+=arr[i];
            answer=sum;
        }
        for(int i=k; i<n; i++){
            sum+=(arr[i]-arr[i-k]);
            answer=Math.max(answer,sum);
        }
        System.out.println(answer);
    }
}
