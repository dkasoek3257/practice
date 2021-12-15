import java.util.Scanner;

public class _2_1_왕실의나이트 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] dx = { -2, -2, -1, -1, 2, 2, 1, 1 };
		int[] dy = { 1, -1, 2, -2, -1, 1, -2, 2 };
		String[] d = { "a", "b", "c", "d", "e", "f", "g", "h" };
		int cnt=0;
		Scanner sc = new Scanner(System.in);
		String NP = sc.nextLine(); // Now point
		String MP = NP.substring(0, 1); // String Move point

		int sx = Integer.parseInt(NP.substring(1, 2));
		int sy = 0;
		for (int i = 0; i < 8; i++) {
			if (d[i].equals(MP))
				sy = i + 1;
		}
		System.out.print(sy);
		System.out.println(sx);

		for (int i = 0; i < 8; i++) {
			
			int EPx = sx + dx[i];
			int EPy = sy + dy[i];
			if(EPx>0&EPx<8&EPy>0&EPy<8) {
				cnt++;
			}
			EPx=sx;
			EPy=sy;
		}
		System.out.println(cnt);
	}

}
