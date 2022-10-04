package Day5;

import java.util.Scanner;

public class SimpleIfDemo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("정수를 쓰세요");
		int Number = in.nextInt();

		if (Number % 2 == 0) {
			System.out.println("짝수");
		}
		if (Number % 2 == 1) {
			System.out.println("홀수");
		}
	}
}
