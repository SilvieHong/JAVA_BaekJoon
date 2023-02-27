import java.util.Scanner;

public class b10103 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n]; // 창영이 던진 주사위
		int b[] = new int[n]; // 상덕이 던진 주사위
		int sum_a = 100; // 창영이 점수
		int sum_b = 100; // 상덕이 점수

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();

			if (a[i] < b[i]) {
				sum_a -= b[i];
			} else if (a[i] > b[i]) {
				sum_b -= a[i];
			} else {
				continue;
			}
		}
		System.out.println(sum_a);
		System.out.println(sum_b);
	}

}
