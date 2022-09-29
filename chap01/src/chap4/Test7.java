package chap4;

import java.util.Scanner;

public class Test7 {

	// 화씨온도
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("화씨온도 : ");
		double f = in.nextInt();

		double c = (double) 5 * (f - 32) / (double) 9;

		System.out.println("섭씨온도 :" + c);

	}

}
