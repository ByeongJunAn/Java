package sec03;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		int x;
		String result;

		Scanner in = new Scanner(System.in);
		System.out.println("정수를 입력하세요 : ");
		x = in.nextInt();

		result = (x % 2 == 1) ? "홀수" : "짝수";

		System.out.println(result);
	}

}
