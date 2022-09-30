package chap5;

import java.util.Scanner;

public class IfElseDemo {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("정수값을 입력하세요");
		int x = in.nextInt();

		if (x % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");

		}
	}

}
