import java.util.Scanner;

public class greedy_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(); // ������ ����
        int M=sc.nextInt(); //���� �ִ� ����
        int[] gram=new int[N];
        for(int i=0; i<N; i++){
            gram[i]=sc.nextInt();
        }
        int result=(N*(N-1))/2;  // nCr => N������ 2���� �̴� ����
       for(int i=0; i<N-1; i++){         // 2������ O(n^2) ���ξ����� ���
           for(int j=i+1;j<N;j++){
               if(gram[i]==gram[j])result-=1;
           }
       }
        System.out.println(result);

       ///////////////////////////////2��° ��� �̰� ����
        int[] weg=new int[11];
        for(int i=0; i<N; i++){  // ���Կ� ���� ������ ����
            weg[gram[i]]+=1;
        }
        int result1=0;
        for(int i=1; i<=M; i++){
            N-=weg[i];   // ���԰� i�� �������� ������ �ߺ� ���� ���� ���ش�
            result1+=weg[i]*N; // ���� i�� ������ ���� x B�� �����Ҽ� �ִ� ����� ��
        }
        System.out.println(result1);

    }
}
