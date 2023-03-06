import java.io.BufferedReader;
import java.io.InputStreamReader;

public class b2441 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		for (int i = n; i > 0; i--) {
			for (int j = n - i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int k = n - i; k < n; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
