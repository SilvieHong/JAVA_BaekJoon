import java.util.Scanner;

public class b20332 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;

		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			sum += a;
		}

		if (sum % 3 == 0) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}

	}

}
