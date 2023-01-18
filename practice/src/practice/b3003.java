package practice;

import java.util.Scanner;

public class b3003 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int f = sc.nextInt();

		int A = 1 - a;
		int B = 1 - b;
		int C = 2 - c;
		int D = 2 - d;
		int E = 2 - e;
		int F = 8 - f;

		System.out.print(A + " " + B + " " + C + " " + D + " " + E + " " + F);

	}

}
