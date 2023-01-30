import java.util.Scanner;

public class b20492 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int w1 = n * (100 - 22) / 100;
		int w2 = n - (n * 20 / 100 * 22 / 100);
		System.out.println(w1 + " " + w2);

	}
}
