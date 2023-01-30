import java.util.Scanner;

public class b21612 {	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		int p = 5 * b - 400;

		System.out.println(p);
		if (b > p) {
			System.out.println(1);
		} else if (b == p) {
			System.out.println(0);
		} else if (b < p) {
			System.out.println(-1);
		}

	}

}
