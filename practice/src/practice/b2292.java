import java.util.Scanner;

public class b2292 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int bee = 1; // 시작 포함

		for (int i = 1; i < 1000000000; i++) {
			bee += 6 * i;
			if (n == 1) {
				System.out.println(1);
				break;
			} else if (n <= bee) {
				System.out.println(i + 1);
				break;
			} else {
				continue;

			}
		}
	}

}
