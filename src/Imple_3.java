import java.util.*;

public class Imple_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int answer=str.length();
        for (int i = 1; i < str.length() / 2 + 1; i++) {
            int cnt = 1;
            String prev = str.substring(0, i);
            String enc = "";
            String last = "";
            for (int j = i; j < str.length(); j += i) {
                if (j + i > str.length()) {    // ex) abc 압축해야하는데 ab 밖에없다면
                    last = str.substring(j);
                    continue;
                }
                if (prev.equals(str.substring(j, j + i))) { //문자열 같으면 cnt 증가
                    cnt++;
                } else {  // 문자열이 다르다? 그대로 enc에 붙이고 cnt가 1아니면 cnt+enc
                    enc += prev;
                    if(cnt!=1)
                    enc = cnt + enc;

                    prev = str.substring(j, j + i);
                    cnt = 1;
                }
            }
            enc+=prev+last;
            if(cnt!=1){
                enc=cnt+enc;
            }
            answer=Math.min(answer,enc.length());
        }
        System.out.println(answer);
    }
}
