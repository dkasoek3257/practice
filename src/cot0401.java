import java.util.HashMap;
import java.util.Scanner;

public class cot0401 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       String s=sc.next();
        HashMap<Character,Integer>map=new HashMap<>();

        for(char x: s.toCharArray()){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        int max=0;
        char answer=' ';
        for(char x:map.keySet()){
            if(map.get(x)>max){
                max=map.get(x);
                answer=x;
            }
        }
        System.out.println(answer);
    }
}
