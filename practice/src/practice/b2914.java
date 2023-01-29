
import java.util.Scanner;

public class b2914 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt(); // 곡의 개수
		int i = sc.nextInt(); // 평균값

		int m = a * i - a + 1;
		System.out.println(m);

	}

}
