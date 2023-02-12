import java.util.Scanner;

public class b5691 {	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int n = 2 * a - b;
			if (a == 0 || b == 0) {
				break;
			}
			System.out.println(n);
		}
	}

}
