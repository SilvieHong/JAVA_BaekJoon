import java.util.Scanner;

public class b2163 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int r1 = (n - 1) + n * (n - 1); // n = m 일때
		int r2 = (m - 1) + m * (n - 1);

		if (n == m) {
			System.out.println(r1);
		} else {
			System.out.println(r2);

		}
	}

}
