import java.util.*;

public class _1_2_숫자카드게임 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int N=sc.nextInt();
		int arr[][]=new int[N][100];
		int min[]=new int[N];
		int M=sc.nextInt();
		
		for(int i=0; i<N; i++) { // 2차원 배열 
			for(int j=0; j<M; j++)
				arr[i][j]=sc.nextInt();
		}
		
		for(int i=0; i<N; i++) { 
			for(int j=1; j<M; j++)
			{
				min[i]=arr[i][j-1];
				if(min[i]>arr[i][j]){
					min[i]=arr[i][j];
				}
			}
		}
		
		Arrays.sort(min);
		
		System.out.println(min[N-1]);
		
		
		
		
//		for(int i=0; i<N; i++) { // 2차원 배열 출력
//			for(int j=0; j<M; j++) {
//				System.out.print(arr[i][j]+" ");
//			}System.out.println();
//		}
		
		
		
	}

}
