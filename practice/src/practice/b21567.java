import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b21567 {

	;
	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long a = Long.parseLong(br.readLine());
		long b = Long.parseLong(br.readLine());
		long c = Long.parseLong(br.readLine());

		long num = a * b * c;
		String str = Long.toString(num); // long > string

		int cnt[] = new int[10];

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '0') {
				cnt[0]++;
			} else if (str.charAt(i) == '1') {
				cnt[1]++;
			} else if (str.charAt(i) == '2') {
				cnt[2]++;
			} else if (str.charAt(i) == '3') {
				cnt[3]++;
			} else if (str.charAt(i) == '4') {
				cnt[4]++;
			} else if (str.charAt(i) == '5') {
				cnt[5]++;
			} else if (str.charAt(i) == '6') {
				cnt[6]++;
			} else if (str.charAt(i) == '7') {
				cnt[7]++;
			} else if (str.charAt(i) == '8') {
				cnt[8]++;
			} else if (str.charAt(i) == '9') {
				cnt[9]++;
			}
		}
		for (int i = 0; i < 10; i++) {
			System.out.println(cnt[i]);
		}

	}

}
