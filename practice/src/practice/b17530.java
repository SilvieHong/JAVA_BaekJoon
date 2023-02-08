import java.util.Scanner;

public class b17530 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int max = 0;

		int people[] = new int[n];

		for (int i = 0; i < n; i++) {
			people[i] = sc.nextInt();
			max = Math.max(max, people[i]);
		}

		if (max <= people[0]) {
			System.out.println("S");
		} else {
			System.out.println("N");
		}

	}

}
