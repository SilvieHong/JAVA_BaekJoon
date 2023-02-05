import java.io.BufferedReader;
import java.io.InputStreamReader;

public class b23037 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		String num = br.readLine();
		int sum = 0;

		for (int i = 0; i < 5; i++) {
			String n = num.substring(i, i + 1);
			int m = Integer.parseInt(n);
			sum += Math.pow(m, 5);

		}
		System.out.println(sum);

	}

}
