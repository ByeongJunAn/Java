package sec03;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {

		int x;
		int y;

		Scanner in = new Scanner(System.in);
		System.out.println("정수를 입력하세요 : ");

		x = in.nextInt();

		y = x * x;
		System.out.println(x + "의 제곱은 " + y);
	}

}
