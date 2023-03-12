import java.util.Scanner;

public class b1152 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String str1 = sc.nextLine(); // 문장 입력 받기
		String str2 = str1.trim(); // 문장 앞뒤의 공백 제거

		int cnt = 0; // 공백 누적합계

		for (int i = 0; i < str2.length(); i++) {
			if (str2.charAt(i) == ' ') {
				cnt++;
			}
		}

		if (str2.isEmpty()) {
			System.out.println(0);
		} else {
			System.out.println(cnt + 1);
		}

	}

}
