import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int[][] num = new int[t][2];

		for (int i = 0; i < t; i++) {
			num[i][0] = sc.nextInt();
			num[i][1] = sc.nextInt();
		}
		
		for (int j = 0; j < t; j++) {
			System.out.println("Case #" + (j+1) + ": " + (num[j][0]+num[j][1]));
		}
	

	}
}
