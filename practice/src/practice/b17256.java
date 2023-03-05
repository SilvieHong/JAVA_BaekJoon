import java.util.Scanner;

public class b17256 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int a[] = new int[3];
		int c[] = new int[3];

		for (int i = 0; i < 3; i++) {
			a[i] = sc.nextInt();
		}
		for (int j = 0; j < 3; j++) {
			c[j] = sc.nextInt();
		}

		int bx = c[0] - a[2];
		int by = c[1] / a[1];
		int bz = c[2] - a[0];
		System.out.print(bx + " " + by + " " + bz);

	}

}
