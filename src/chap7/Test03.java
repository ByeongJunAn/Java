package chap7;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		int result;
		int n;

		Scanner in = new Scanner(System.in);
		System.out.println("팩토리얼을 구할 정수를 입력하세요: ");
		n = in.nextInt();
		result = 1;
		while (n > 0) {

			result = result * n;
			n--;

		}

		System.out.println(result);

	}

}

// 팩토리얼 값을 계산하는 프로그램을 작성하라