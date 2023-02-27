import java.math.BigInteger;
import java.util.Scanner;

public class b14928 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String n = sc.next();
		BigInteger a = new BigInteger(n);
		BigInteger m = new BigInteger("20000303");

		BigInteger result = a.mod(m);
		System.out.println(result);

	}

}
