import java.util.Scanner;

public class b6778 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); // antennas
		int b = sc.nextInt(); // eyes

		if (a >= 3 && b <= 4) {
			System.out.println("TroyMartian");
		}
		if (a <= 6 && b >= 2) {
			System.out.println("VladSaturnian");
		}
		if (a <= 2 && b <= 3) {
			System.out.println("GraemeMercurian");
		}

	}
}
