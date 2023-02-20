import java.util.Scanner;

public class b2577 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int num = a * b * c;

		int sum0 = 0;
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		int sum4 = 0;
		int sum5 = 0;
		int sum6 = 0;
		int sum7 = 0;
		int sum8 = 0;
		int sum9 = 0;

		String n = Integer.toString(num);
		int length = n.length();

		for (int i = 0; i < length; i++) {
			String m = n.substring(i, i + 1);
			int z = Integer.parseInt(m);
			if (z == 0) {
				sum0 += 1;
			} else if (z == 1) {
				sum1 += 1;
			} else if (z == 2) {
				sum2 += 1;
			} else if (z == 3) {
				sum3 += 1;
			} else if (z == 4) {
				sum4 += 1;
			} else if (z == 5) {
				sum5 += 1;
			} else if (z == 6) {
				sum6 += 1;
			} else if (z == 7) {
				sum7 += 1;
			} else if (z == 8) {
				sum8 += 1;
			} else if (z == 9) {
				sum9 += 1;
			}

		}
		System.out.println(sum0);
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);
		System.out.println(sum4);
		System.out.println(sum5);
		System.out.println(sum6);
		System.out.println(sum7);
		System.out.println(sum8);
		System.out.println(sum9);

	}

 }
