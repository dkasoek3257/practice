import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class _4_1_UpDown {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();  // 수열 원소 개수
        int[] arr=new int[N];
        for(int i=0; i<arr.length; i++){ // 수열 숫자 받기
            arr[i]=sc.nextInt();
        }

//        Integer[] integersArr=Arrays.stream(arr).boxed().toArray(Integer[]::new); // 내림차순 배열 정렬
//        Arrays.sort(integersArr, Comparator.reverseOrder());
//        for(int i=0; i<arr.length; i++){ //배열 출력
//            System.out.print(integersArr[i]+" ");
//        }


        Arrays.sort(arr);
        for( int i=0; i < (arr.length/2); i++) {  //reverse
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
        for(int i=0; i<arr.length; i++){ //배열 출력
            System.out.print(arr[i]+" ");
        }






    }
}
