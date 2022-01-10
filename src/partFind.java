import java.util.Arrays;
import java.util.Scanner;

public class partFind {

    public static int binSearch(int[] array, int target, int start, int end){
        while (start <= end) {
            int mid = (start + end) / 2; // 중간값

            if (array[mid] == target) return mid;

            else if (array[mid] > target) end = mid - 1;

            else start = mid + 1;
        }
        return -1;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int N = sc.nextInt(); //가게 부품수
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) { //가게의 부품번호 입력받음
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);



        int M = sc.nextInt();
        int[] target = new int[M];
        for (int i = 0; i < M; i++) {
            target[i] = sc.nextInt();
        }


        for (int i=0; i<M;i++) {
            //부품 존재 확인
           int result=binSearch(arr, target[i], 0, N - 1);
           if(result!=-1){
               System.out.print("yes ");
           }else{
               System.out.print("No ");
           }
        }
    }
}
