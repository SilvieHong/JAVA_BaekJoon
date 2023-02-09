import java.util.Scanner;

public class b11367 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String name[] = new String[n];
		int score[] = new int[n];

		for (int i = 0; i < n; i++) {
			name[i] = sc.next();
			score[i] = sc.nextInt();
			if (score[i] >= 97) {
				System.out.println(name[i] + " A+");
			} else if (score[i] >= 90) {
				System.out.println(name[i] + " A");
			} else if (score[i] >= 87) {
				System.out.println(name[i] + " B+");
			} else if (score[i] >= 80) {
				System.out.println(name[i] + " B");
			} else if (score[i] >= 77) {
				System.out.println(name[i] + " C+");
			} else if (score[i] >= 70) {
				System.out.println(name[i] + " C");
			} else if (score[i] >= 67) {
				System.out.println(name[i] + " D+");
			} else if (score[i] >= 60) {
				System.out.println(name[i] + " D");
			} else {
				System.out.println(name[i] + " F");
			}
		}

	}

}
