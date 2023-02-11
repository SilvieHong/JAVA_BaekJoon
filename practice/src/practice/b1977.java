import java.util.Scanner;

public class b1977 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int m = sc.nextInt();
		int n = sc.nextInt();
		int sum = 0; // 더하는 변수 초기화(중요)
		int min = 10000; // m과 n은 10000이하의 자연수,

		for (int i = m; i <= n; i++) {

			// Math.sqrt() 연산후 double형이 되기 때문에 int로 강제형변환!!
			int num = (int) Math.sqrt(i);

			if (num * num == i) {
				sum += i;
				min = Math.min(min, i); // 최소값 구하기

			}
		}
		if(sum == 0) {
			System.out.println(-1);
		}else {
			System.out.println(sum);
			System.out.println(min);
		}

	}

}
