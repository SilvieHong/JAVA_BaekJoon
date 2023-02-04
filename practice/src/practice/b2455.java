import java.util.Arrays;
import java.util.Scanner;

public class b2455 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int out [] = new int[4];
		int in [] = new int[4];
		int sum[] = new int[4];
		int left[] = new int[4];

		for (int i = 0; i < 4; i++) {
			out[i] = sc.nextInt();
			in[i] = sc.nextInt();
			sum[i] = in[i] - out[i];

			for (int j = 0; j < i; j++) {
				left[j] += sum[i];
				}
		}
		Arrays.sort(left);
		System.out.println(-left[0]);

	}

}
