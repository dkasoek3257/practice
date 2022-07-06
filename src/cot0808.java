import java.util.Scanner;

public class cot0808 {
    static int n,f;
    int[] b=new int[n];

    public int DFS(int n,int r){
        for(int i=0; i<n; i++){
            b[i]=DFS(n,n-1);
        }
        if(n==r||r==0)return 1;
        else return DFS(n-1,r-1)+DFS(n-1,r);
    }

    public static void main(String[] args) {
        cot0807 T=new cot0807();
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        f=sc.nextInt();
        T.DFS(n,f);
    }
}
