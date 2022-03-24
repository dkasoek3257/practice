import java.util.Scanner;

public class cot0103 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] s=str.split(" ");
        String max=s[0];
        for(String arr:s){
            if(max.length()<arr.length()){
                max=arr;
            }
        }
        System.out.println(max);
    }
}
