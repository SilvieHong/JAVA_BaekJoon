import java.util.Scanner;

public class b5565 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int total = 0;

		for (int i = 0; i < 9; i++) {
			int a = sc.nextInt();
			total += a;
		}

		System.out.println(n - total);

	}

}
