import java.util.Scanner;

public class cot0212 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m=sc.nextInt();
        int[][] arr=new int[m][n];
        int answer=0;
        for(int i=0; i<m; i++){  // 입력받기
            for(int j=0; j<n; j++){
                arr[i][j]=sc.nextInt();
            }
        }


        System.out.println(answer);
    }
}
