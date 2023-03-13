import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b2443 {

	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); //

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			};
			for (int k = (2 * n) - (i * 2 + 1); k > 0; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
