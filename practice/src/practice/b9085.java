import java.util.Scanner;

public class b9085 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int sum = 0;

		for (int i = 0; i < t; i++) {
			int a = sc.nextInt();
			for (int j = 0; j < a; j++) {
				int n = sc.nextInt();
				sum += n;
			}
			System.out.println(sum);
			sum = 0;
		}

	}

}
