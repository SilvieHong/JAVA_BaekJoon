import java.util.Scanner;

public class b21300 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int recycle[] = new int[6];
		int sum = 0;
		
		for (int i = 0; i < 6; i++) {
			recycle[i] = sc.nextInt();
			sum += recycle[i] * 5;
		}
		System.out.println(sum);

	}

}
