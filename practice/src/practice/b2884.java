import java.util.Scanner;

public class b2884 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		int t1 = h * 60 + m - 45;
		int t2 = 24 * 60 + m - 45;

		if (m >= 45) {
			System.out.println(h + " " + (m - 45));
		} else if (h == 0) {
			System.out.println(t2 / 60 + " " + (t2 - (t2/60 * 60)));
		} else {
			System.out.println(t1 / 60 + " " + (t1 - (t1/60 * 60)));
		}

	}

}
