import java.util.Arrays;
import java.util.Scanner;

public class Imple_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int size=str.length();
        char []arr=new char[size];

        int sum=0;

        for(int i=0; i<size; i++){
            if(str.charAt(i)>=65 && str.charAt(i)<=90){
                arr[i]=str.charAt(i);
            }else {
                sum += (str.charAt(i) - '0');
            }
        }
        Arrays.sort(arr);
        String result=new String(arr).trim();  // 공백제거
        System.out.println(result+sum);
    }
}
