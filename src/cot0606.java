import java.util.Arrays;
import java.util.Scanner;

public class cot0606 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] a=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        a=arr.clone();
        Arrays.sort(arr);
        String answer="";
        for (int i = 0; i < n; i++){
            if(arr[i]-a[i]!=0)answer+=(i+1)+" ";
        }
        System.out.println(answer);
        System.out.println();


    }
}
