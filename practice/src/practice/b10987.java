import java.util.Scanner;

public class b10987 {

	public static void main(String[] args) {

		int count = 0;

		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		char[] ex = { 'a', 'e', 'i', 'o', 'u' };

		for (int i = 0; i < word.length(); i++) {
			char result = word.charAt(i);
			
			for (int j = 0; j < ex.length; j++) {
				if (result == ex[j]) {
					count += 1;
				}

			}

		}
		System.out.println(count);

	}

}
