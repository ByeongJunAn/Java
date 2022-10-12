package Day07;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		int result;
		int n;
		System.out.println("팩토리얼을 구할 정수: ");
		Scanner in = new Scanner(System.in);

		n = in.nextInt();
		result = 1;
		while (true) {

			while (n > 0) {
				result = result * n;
				n--;

			}
			if (n < 1)
				break;
		}
		System.out.println(result);
	}

}

//while문을 사용해 팩토리얼 값을 구하라