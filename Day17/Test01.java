package Day17;

import java.util.Random;
import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		System.out.print("정수를 입력하세요1");
		Random r = new Random();
		Scanner in = new Scanner(System.in);
		int c;

		int a = in.nextInt();
		System.out.print("정수를 입력하세요2");
		int b = in.nextInt();

		if (a < b)
			for (int i = a; i < b; i++) {
				c = i;
				System.out.println(c);
				System.out.print(r.nextInt(c));
//				System.out.print(nextInt(10) + " ");
			}
		else {
			int temp = 0;
			temp = a;
			a = b;
			b = temp;

			for (int i = a; i < b; i++) {
				c = i;
				System.out.println(c);
			}

		}
	}
}
