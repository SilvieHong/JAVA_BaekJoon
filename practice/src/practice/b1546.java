import java.util.Arrays;
import java.util.Scanner;

public class b1546 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double num[] = new double[n];
		double score[] = new double[n];

		for (int i = 0; i < n; i++) {
			num[i] = sc.nextFloat();
		}

		Arrays.sort(num);
		double m = num[n - 1]; // 최대값

		double sum = 0;
		for (int j = 0; j < n; j++) {
			score[j] = num[j] / m * 100;
			sum += score[j];
		}
		System.out.println(sum / n);

	}

}
