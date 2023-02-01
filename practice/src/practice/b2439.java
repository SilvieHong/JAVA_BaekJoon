import java.util.Scanner;

public class b2439 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) { 
			for (int j = n - i - 1; j > 0; j--) {
				System.out.print(" ");
			}
			for (int k = n - i - 1; k < n; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
