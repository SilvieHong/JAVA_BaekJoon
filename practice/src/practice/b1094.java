import java.util.Scanner;

public class b1094 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		int cnt = 0; // 막대기 개수 누적변수
		int s = 64; // 처음 막대기

		while (x > 0) {
			if (s > x) {
				s /= 2;
			} else {
				cnt++;
				x -= s;
			}
		}
		System.out.println(cnt);

	}

}
