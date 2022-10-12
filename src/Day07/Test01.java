package Day07;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {

		System.out.print("나이를 입력하세요 : ");
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();

		if (x >= 19) {
			System.out.println("성년");

		}

		else {
			System.out.println("미성년");

		}

	}
}

//키보드로 입력한 정수가 19이상이면 '성년', 아니면 '미성년' 을 출력하는 프로그램을 if~else 문을 사용해 작성해라