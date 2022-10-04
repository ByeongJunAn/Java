package Day5;

public class For2Demo {

	public static void main(String[] args) {

		for (int i = 2; i < 10; i++) {
			for (int y = 1; y < 10; y++) {
				System.out.printf("%4d", i * y);
			}

			System.out.println();
		}
	}

}