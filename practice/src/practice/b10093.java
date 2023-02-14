import java.util.Scanner;

public class b10093 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();

		
		if(a == b) {
			System.out.println(0);
			
		}else {
			System.out.println(Math.abs(b - a) - 1);
			long num[] = new long[(int) (Math.abs(b - a) - 1)];
			for (int i = 0; i < Math.abs(b - a) - 1; i++) {
				
				if (a >= b) {
					num[i] = i + b + 1;
					System.out.print(num[i] + " ");
				} else {
					num[i] = i + a + 1;
					System.out.print(num[i] + " ");
				}
			}
			
		}
		


	}

}
