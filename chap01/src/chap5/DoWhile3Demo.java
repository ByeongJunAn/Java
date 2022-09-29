package chap5;

public class DoWhile3Demo {

	public static void main(String[] args) {
		int i = 2;
		do {
			int y = 1;
			do {
				System.out.printf("%4d", i * y);
				y++;
			} while (y < 10);
			System.out.println();
			i++;
		} while (i < 10);
	}

}
