import java.util.Scanner;

public class b4562 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] data = new int[n][2];

		for (int i = 0; i < n; i++) {
			data[i][0] = sc.nextInt();
			data[i][1] = sc.nextInt();
		}

		for (int j = 0; j < n; j++) {
			if (data[j][0] >= data[j][1]) {
				System.out.println("MMM BRAINS");
			} else {
				System.out.println("NO BRAINS");
			}
		}

	}

}
