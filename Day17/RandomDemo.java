package Day17;

import java.util.Random; // util에 있는 랜덤은 Math에 있는 랜덤과는 다르게 객체를 생성해야 한다.

public class RandomDemo {

	public static void main(String[] args) {
		Random r = new Random();

		for (int i = 0; i < 5; i++)
			System.out.print(r.nextInt(100) + " ");

		Random r2 = new Random(System.currentTimeMillis());

		System.out.println();

		for (int i = 0; i < 5; i++)
			System.out.print(r2.nextInt(100) + " ");

		System.out.println();

	}
}
