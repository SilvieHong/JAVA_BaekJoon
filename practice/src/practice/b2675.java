import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b2675 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		for (int i = 0; i < t; i++) {
			String[] str = br.readLine().split(" ");
			int r = Integer.parseInt(str[0]);	
			String s = str[1];

			for (int j = 0; j < s.length(); j++) {
				for (int k = 0; k < r; k++) {
					System.out.print(s.charAt(j));
				}

			}
			System.out.println();
		}

	}

}