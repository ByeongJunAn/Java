package Day07;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {

		int result;
		int n;

		Scanner in = new Scanner(System.in);
		n = in.nextInt();

		result = factorial(n);
		System.out.println(result);
	}

	public static int factorial(int x) {
		int r = 1;
		while (x > 0) {

			r = r * x;
			x--;

		}
		return r;

	}

}

// 팩토리얼 계산 과정을 메서드로 작성하라.