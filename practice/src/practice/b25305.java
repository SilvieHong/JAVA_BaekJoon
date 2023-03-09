import java.util.Arrays;
import java.util.Scanner;

public class b25305 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); // 응시자의 수
		int k = sc.nextInt(); // 상을 받는 수
		int score[] = new int[n];

		for (int i = 0; i < n; i++) {
			score[i] = sc.nextInt();
		}

		Arrays.sort(score);
		
		if (n == k) {
			System.out.println(score[0]);
		} else {
			System.out.println(score[n - k]);

		}

	}

}
