import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class b3052 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashSet<String> hashSet = new HashSet<>();

		String[] cnt = new String[10];
		int sum = 0;

		for (int i = 0; i < 10; i++) {
			int a = Integer.parseInt(br.readLine());
			cnt[i] = String.valueOf(a % 42);
		}

		for (String item : cnt) {
			hashSet.add(item);
		}

		System.out.println(hashSet.size());

	}

}
