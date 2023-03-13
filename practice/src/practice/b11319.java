import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b11319 {

	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int s = Integer.parseInt(br.readLine());

		for (int i = 0; i < s; i++) {
			int vl = 0;
			int cp = 0;
			String str = br.readLine().replaceAll("\\p{Z}", "").toLowerCase();

			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j) == 'a' || str.charAt(j) == 'e' || str.charAt(j) == 'i' || str.charAt(j) == 'o'
						|| str.charAt(j) == 'u') {
					vl++;
				} else {
					cp++;
				}
			}
			System.out.println(cp + " " + vl);

		}

	}

}
