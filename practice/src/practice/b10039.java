import java.util.Scanner;

public class b10039 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] score = new int[5];
		int sum = 0;
		int avg = 0;

		for (int i = 0; i < 5; i++) {
			score[i] = sc.nextInt();

			if (score[i] < 40) {
				score[i] = 40;
			} else {
				score[i] = score[i];
			}

			sum += score[i];
			avg = sum / 5;
		}
		System.out.println(avg);

	}

}
