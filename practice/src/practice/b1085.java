import java.util.Scanner;

public class b1085 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		int result = 1000;

		int[] d = new int[] { x, y, w - x, h - y };

		for (int i = 0; i < 4; i++) {
			result = Math.min(result, Math.min(1000, d[i]));
		}
		System.out.println(result);
	}

}
