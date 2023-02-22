import java.util.Scanner;

public class b27433 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long result = 1;

		if (n == 0) {
			System.out.println(1);
		} else {
			for (int i = 1; i <= n; i++) {
				result *= i;
			}
			System.out.println(result);
		}
	}

}
