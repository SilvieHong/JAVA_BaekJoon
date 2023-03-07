import java.util.Scanner;

public class b2506 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 문제의 개수
		int s = 0; // 점수 누적 변수
		int count = 0;
		int sum = 0;

		for (int i = 0; i < n; i++) {
			int score = sc.nextInt();
			if (score == 1) {
				count++;
			} else {
				count = 0;
			}
			sum += count;
		}
		System.out.println(sum);
	}
}
