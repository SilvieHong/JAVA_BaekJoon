import java.util.Scanner;

public class b23825 {

	public static void main(String[] args) {

		int sum = 0;

		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int a = sc.nextInt();

		int m = s / 2;
		int n = a / 2;

		if (m >= n) {
			System.out.println(n);
		} else {
			System.out.println(m);
		}

	}

}
