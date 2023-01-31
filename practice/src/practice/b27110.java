import java.util.Scanner;

public class b27110 {	

	public static void main(String[] args) {
		
		int sum = 0;
		int food[] = new int[3];
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 0; i < 3; i++) {
			food[i] = sc.nextInt();

			if (food[i] <= n) {
				sum += food[i];
			} else {
				sum += n;
			}
		}
		System.out.println(sum);
	}

}
