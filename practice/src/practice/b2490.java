import java.util.Scanner;

public class b2490 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int count = 0; // 등의 개수

		while (sc.hasNextInt()) {
			for (int i = 0; i < 4; i++) {
				int a = sc.nextInt();
				if (a == 1) {
					count += 1;

				}
			}
			if (count == 0) {
				System.out.println("D");
			} else if (count == 1) {
				System.out.println("C");
			} else if (count == 2) {
				System.out.println("B");
			} else if (count == 3) {
				System.out.println("A");
			} else {
				System.out.println("E");
			}
			count = 0;
		}

	}

}
