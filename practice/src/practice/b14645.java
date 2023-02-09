import java.util.Scanner;

public class b14645 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int station = sc.nextInt(); 
		int start = sc.nextInt();

		for (int i = 0; i < station; i++) {
			int in = sc.nextInt();
			int out = sc.nextInt();
			start += in;
			start -= out;

		}

		System.out.println("비와이");

	}

}
