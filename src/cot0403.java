import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class cot0403 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> answer = new ArrayList<>();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        for (int lt = 0; lt < k - 1; lt++) {
            map.put(arr[lt], map.getOrDefault(arr[lt], 0) + 1);
        }
        int rt = k-1;
        int lt = 0;
        while (rt < n) {
            map.put(arr[rt], map.getOrDefault(arr[rt], 0) + 1);
            answer.add(map.size());
            map.put(arr[lt],map.get(arr[lt])-1);
            if(map.get(arr[lt])==0)map.remove(arr[lt]);
            lt++;
            rt++;
        }
        for (int y : answer) {
            System.out.print(y + " ");
        }
    }
}
