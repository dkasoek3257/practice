import java.util.Arrays;
import java.util.Scanner;

public class cot0610 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int answer=0;
        int lt=1,rt=arr[n-1];
        while(lt<=rt){
            int mid=(lt+rt)/2;
            if(count(arr,mid)>=c){
                answer=mid;
                lt=mid+1;
            }else {
                rt=mid-1;
            }
        }
        System.out.println(answer);
    }

    private static int count(int[] arr, int dist) {
        int cnt=1;
        int ep=arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]-ep>=dist){
                ep=arr[i];
                cnt++;
            }
        }
        return cnt;
    }
}
