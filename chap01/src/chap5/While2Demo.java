package chap5;

public class While2Demo {

	public static void main(String[] args) {

		int i = 2;

		while (i < 10) {

			System.out.print(i + "단: ");

			int j = 1;
			while (j < 10) {
				System.out.println(i + "x" + j + "=" + i * j);
				++j;
			}

			System.out.printf("%s\n", "");

			++i;

		}

	}
}
