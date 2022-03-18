import java.util.Scanner;

public class greedy_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(); // 볼링공 갯수
        int M=sc.nextInt(); //공의 최대 무게
        int[] gram=new int[N];
        for(int i=0; i<N; i++){
            gram[i]=sc.nextInt();
        }
        int result=(N*(N-1))/2;  // nCr => N개에서 2개를 뽑는 갯수
       for(int i=0; i<N-1; i++){         // 2중포문 O(n^2) 별로안좋은 방법
           for(int j=i+1;j<N;j++){
               if(gram[i]==gram[j])result-=1;
           }
       }
        System.out.println(result);

       ///////////////////////////////2번째 방법 이게 정석
        int[] weg=new int[11];
        for(int i=0; i<N; i++){  // 무게에 따른 볼링공 개수
            weg[gram[i]]+=1;
        }
        int result1=0;
        for(int i=1; i<=M; i++){
            N-=weg[i];   // 무게가 i인 볼링공의 개수를 중복 제외 위해 빼준다
            result1+=weg[i]*N; // 무게 i인 볼링공 개수 x B가 선택할수 있는 경우의 수
        }
        System.out.println(result1);

    }
}
