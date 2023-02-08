import java.io.BufferedReader;
import java.io.InputStreamReader;

public class b17863 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String phone = br.readLine();
		String num = phone.substring(0,3);
		
		if (num.equals("555")) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}

}
