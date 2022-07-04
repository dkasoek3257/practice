import java.util.Scanner;

public class cot0803 {
    static int n,m;
    static int answer;
    public void DFS(int L,int ssum,int tsum,int score[],int time[]){
        if(m<tsum)return;
        if(L==n){
            answer=Math.max(answer,ssum);
        }else{
            DFS(L+1,ssum+score[L],tsum+time[L],score,time);
            DFS(L+1,ssum,tsum,score,time);
        }

    }
    public static void main(String[] args) {
        cot0803 T=new cot0803();
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        int[] score=new int[n];
        int[] time=new int[n];
        for(int i=0;i<n;i++){
            score[i]=sc.nextInt();
            time[i]=sc.nextInt();
        }
        T.DFS(0,0,0,score,time);
        System.out.println(answer);
    }
}
