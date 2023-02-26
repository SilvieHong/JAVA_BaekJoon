import java.util.Scanner;

public class b14912 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int d = sc.nextInt();

		int cnt = 0;

		for (int i = 1; i < n + 1; i++) {
			int t = i;
			while (t > 0) {
				if (t % 10 == d) {
					cnt++;
				}
				t /= 10;
			}
		}
		System.out.println(cnt);

	}

}
