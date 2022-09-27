package sec02;

import java.util.Scanner;

public class ArithmeticDemo {

	public static void main(String[] args) {

		int remainder = 25 % 2;
		System.out.println("25 ÷ 2의 나머지는" + remainder + "입니다.");

		Scanner in = new Scanner(System.in);
		System.out.println("숫자입력: ");

		int x = in.nextInt();

		remainder = x % 2;
		System.out.println((remainder == 0) ? "짝수" : "홀수");

		int num1 = 7;
		int num2 = 3;
		double remainder1 = (double) num1 / num2;

		System.out.println("num1 / num2 = " + remainder1);

	}

}
