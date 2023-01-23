import java.util.Scanner;

public class b25304 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		int [][] thing = new int[n][2];
		
		int total = 0;
		for(int i=0; i<n;i++) {
				thing[i][0] = sc.nextInt();
				thing[i][1] = sc.nextInt();
				total += thing[i][0] * thing[i][1];
		}
		
		if(total ==x) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
