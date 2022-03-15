import java.util.Scanner;

public class greedy_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();

        String[]strArray=str.split("");
        int result = Integer.parseInt(strArray[0]);
        for(int i=1; i< strArray.length;i++) {
            int num = Integer.parseInt(strArray[i]);
            if (result <= 1 || num <= 1) {
                result += num;
            } else {
                result *= num;
            }
        }
        System.out.println(result);
    }
}
