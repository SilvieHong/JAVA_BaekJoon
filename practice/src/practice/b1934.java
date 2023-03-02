import java.util.Scanner;

// 최대 공약수 구하는 class
public class b1934 {
	static int gcd(int a, int b) {
		int i = Math.min(a, b);
		while (true) {
			if (a % i == 0 && b % i == 0) {
				return i;
			}
			i = i - 1;
		}
	}

// 최소 공배수 구하는 class
	static int lcm(int a, int b) {
		if (gcd(a, b) == 1) { // a, b가 서로소일 때
			return gcd(a, b) * a * b;

		} else { // a, b가 서로소가 아닐 때
			return a * b / gcd(a, b);

		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(); // 테스트 개수

		for (int k = 0; k < t; k++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			System.out.println(lcm(x, y));
		}
	}

}
