import java.math.BigInteger;
import java.util.Scanner;

public class b13277 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String n1 = sc.next();
		String n2 = sc.next();

		BigInteger a = new BigInteger(n1);
		BigInteger b = new BigInteger(n2);
		
		BigInteger result = a.multiply(b);
		System.out.println(result);

	}

}
