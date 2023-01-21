import java.util.Scanner;

public class b9498 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int A = a/10;
		
		if(A == 9 || A == 10) {
			System.out.println("A");
		}else if(A == 8) {
			System.out.println("B");
		}else if(A == 7) {
			System.out.println("C");
		}else if(A == 6) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
	
	}

}
