package chap5;

public class IFTest1 {

	public static void main(String[] args) {

		int num = 120;
		if (num > 0) {
			if ((num % 2) == 0)
				System.out.println("양수이면서 짝수");

			if ((num > 0) && ((num % 2 == 0))) {
				System.out.println("양수이면서 짝수");
			}

		}

	}

}
