package practice;

import java.util.Scanner;

public class b2588 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		int A = b / 100;
		int B = b / 10 - A * 10;
		int C = b - ((A * 100) + (B * 10));

		System.out.println(a * C);
		System.out.println(a * B);
		System.out.println(a * A);
		System.out.println(a * b);

	}

}
