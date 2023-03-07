import java.util.Arrays;
import java.util.Scanner;

public class b2750 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 수의 개수
		int num[] = new int[n];

		for (int i = 0; i < n; i++) {
			num[i] = sc.nextInt();
		}

		for (int j = 0; j < n; j++) {
			Arrays.sort(num);
			System.out.println(num[j]);
		}

	}

}
