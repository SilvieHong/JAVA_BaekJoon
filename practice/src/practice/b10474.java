import java.util.Scanner;

public class b10474 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		while (true) {

			int a = sc.nextInt();
			int b = sc.nextInt();

			if (a == 0 && b == 0) {
				break;
			}

			int portion = a / b;
			int remain = a - portion * b;

			System.out.println(portion + " " + remain + " / " + b);
		}

	}

}
