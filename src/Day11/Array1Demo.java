package Day11;

import java.util.Scanner;

public class Array1Demo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int scores[] = new int[5];
		int sum = 0;

		for (int i = 0; i < scores.length; i++)
			scores[i] = in.nextInt();

		for (int i = 0; i < scores.length; i++)
			sum += scores[i];

		System.out.printf("평균 = " + sum / 5.0);
//		System.out.printf("평균 = " + sum / scores.length); 로 해도 됨

	}

}
