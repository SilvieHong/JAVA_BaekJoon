import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b2442 {

	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); //

		for (int i = 0; i < n; i++) {
			if (n - i - 1 != 0) {System.out.print(String.format("%" + (n - i - 1) + "s", " "));
				};
			for (int j = 1; j <= 2 * i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
