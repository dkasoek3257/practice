import java.util.Scanner;

public class cot0207 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pro = sc.nextInt();
        int[] score = new int[pro];

        for (int i = 0; i < score.length; i++) {
            score[i] = sc.nextInt();
        }
        // ³»°¡ Â§ ÄÚµå
//        int[] arr=new int[pro];
//        if(score[0]==1){
//            arr[0]=1;
//        }else{
//            arr[0]=0;
//        }
//        for (int i = 1; i < score.length; i++) {
//            if(score[i]==1&&score[i-1]==1){
//                arr[i]=arr[i-1]+1;
//            }else if(score[i]==1&&score[i-1]==0){
//                arr[i]=1;
//            }else{
//                arr[i]=0;
//            }
//        }
//        int sum=0;
//        for (int i = 0; i < score.length; i++){
//            sum+=arr[i];
//        }
        int answer = 0, cnt = 0;
        for (int i = 0; i < pro; i++) {
            if (score[i] == 1) {
                cnt++;
                answer += cnt;
            } else cnt = 0;
        }
        System.out.println(answer);
    }
}
