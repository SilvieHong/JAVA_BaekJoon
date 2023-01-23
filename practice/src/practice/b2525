import java.util.Scanner;

public class b2525 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

// 		23 00 과 120 출력했을 때 오류		
//		int h = sc.nextInt(); // 시
//		int m = sc.nextInt(); // 분
//		int t = sc.nextInt(); // 조리시간
//
//		int result = h * 60 + m + t;
//		int rh = result / 60;
//		int rm = result - rh * 60;
//		int rh2 = (result - 1440) / h;
//		int rm2 = (result - 1440) - rh2 * 60;
//
//		if (result <= 1440) {
//			System.out.println(rh + " " + rm);
//		} else {
//			System.out.println(rh2 + " " + rm2);
//		}

		int h = sc.nextInt();
		int m = sc.nextInt();
		int t = sc.nextInt();

		if (m + t < 60) {
			System.out.println(h + " " + (m + t));
		} else {
			int r1 = (m + t) / 60;
			int r2 = (m + t) % 60;
			if ((h + r1) >= 24) {
				System.out.println(((h + r1) % 24) + " " + r2);
			} else {
				System.out.println((h + r1) + " " + r2);
			}
		}

	}
}
