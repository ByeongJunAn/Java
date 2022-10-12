package Day07;

import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		int count = 1;
		int sum = 0;
		int input;

		Scanner in = new Scanner(System.in);

		do {

			System.out.print("양의 정수를 입력하세요");
			input = in.nextInt();
			if (!(input > 0)) {
				System.out.println("양의 정수가 아니므로 프로그램을 종료합니다.");

			}

			++count;

			if (input % 2 == 0) {
				sum += input;

			}

		} while (count <= 5);

		System.out.println("입력한 양의 정수 중에서 짝수의 합은" + sum + "입니다");

	}
}

//키보드로 입력된 양의 정수 중에서 짝수만 덧셈해서 출력하는 코드르 do~while 문을 사용해 작성하라. 단, 입력된 정수가 양수가 아니라면 입력을 종료한다.
