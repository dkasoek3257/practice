import java.util.Arrays;
import java.util.Scanner;

public class greedy_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        int result = 0;
        int n = sc.nextInt();  // ���谡 �� N
        int[] arr = new int[n]; //������ ����
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr); //����
        for(int i=0; i<n; i++){
            cnt+=1;
            if(cnt>=arr[i]){
                result+=1;
                cnt=0;
            }
        }


        System.out.println(result);
    }
}
