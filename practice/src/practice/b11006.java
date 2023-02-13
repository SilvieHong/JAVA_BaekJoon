import java.util.Scanner;

public class b11006 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int i = 0; i < t; i++) {
			int a = sc.nextInt(); 
			int b = sc.nextInt(); 

			int sick = 2 * b - a;
			int normal = b - sick;

			System.out.println(sick + " " + normal);
		}
	}

}
