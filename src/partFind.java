import java.util.Arrays;
import java.util.Scanner;

public class partFind {

    public static int binSearch(int[] array, int target, int start, int end){
        while (start <= end) {
            int mid = (start + end) / 2; // �߰���

            if (array[mid] == target) return mid;

            else if (array[mid] > target) end = mid - 1;

            else start = mid + 1;
        }
        return -1;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int N = sc.nextInt(); //���� ��ǰ��
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) { //������ ��ǰ��ȣ �Է¹���
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);



        int M = sc.nextInt();
        int[] target = new int[M];
        for (int i = 0; i < M; i++) {
            target[i] = sc.nextInt();
        }


        for (int i=0; i<M;i++) {
            //��ǰ ���� Ȯ��
           int result=binSearch(arr, target[i], 0, N - 1);
           if(result!=-1){
               System.out.print("yes ");
           }else{
               System.out.print("No ");
           }
        }
    }
}
