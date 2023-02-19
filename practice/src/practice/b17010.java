import java.util.Scanner;

public class b17010 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			String b = sc.next();
			for (int j = 0; j < a; j++) {
				System.out.print(b);
			}
			System.out.println();
		}

	}

}
