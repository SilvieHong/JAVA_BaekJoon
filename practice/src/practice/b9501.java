import java.util.Scanner;

public class b9501 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(); // test 개수
		int count = 0;

		for (int i = 0; i < t; i++) {
			int n = sc.nextInt(); // 우주선의 개수
			int d = sc.nextInt(); // 목적지까지의 거리

			for (int j = 0; j < n; j++) {
				int v = sc.nextInt(); // 우주선의 최고속도
				int f = sc.nextInt(); // 우주선의 연료양
				int c = sc.nextInt(); // 우주선의 연료소비율
				double time = (double) f / c; // 나눗셈에 조심해

				if (d <= time * v) {
					count += 1;

				}

			}
			System.out.println(count);
			count = 0;
		}

	}

}
