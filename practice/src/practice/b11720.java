import java.util.Scanner;

public class b11720 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 숫자의 개수
		String num = sc.next();

		int sum = 0;		// 합을 저장할 변수

		for (int i = 0; i < n; i++) {
			String a = num.substring(i, i + 1);
			int b = Integer.parseInt(a);
			sum += b;
		}
		System.out.println(sum);

	}

}
