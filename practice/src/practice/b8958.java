import java.util.Scanner;

public class b8958 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 테스트의 개수
		int s = 0; // 점수 누적 변수
		int count = 0;
		int sum = 0;

		for (int i = 0; i < n; i++) {
			String score = sc.next(); // OX점수
			int l = score.length(); // 문제의 개수
			for (int j = 0; j < l; j++) {
				String a = score.substring(j, j + 1);
				if (a.equals("O")) {
					count++;
				} else {
					count = 0;
				}
				sum += count;
			}
			System.out.println(sum);
			sum = 0;
			count = 0;
		}
	}
}
