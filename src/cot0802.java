import java.util.Scanner;

public class cot0802 {
    static int answer;
    static int c,n;
       public void DFS(int L,int sum,int[] arr){
           if(sum>c)return;
            if(L==n){
               answer=Math.max(answer,sum);
            }
            else{
                DFS(L+1,sum+arr[L],arr);
                DFS(L+1,sum,arr);
            }
       }
    public static void main(String[] args) {
        cot0802 T=new cot0802();
        Scanner kb=new Scanner(System.in);
        c=kb.nextInt();
        n=kb.nextInt();
        int [] arr=new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = kb.nextInt();
        }
        T.DFS(0,0,arr);
        System.out.println(answer);
    }
}
