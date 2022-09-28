package sec03;

public class OperatorPrecedenceDemo {

	public static void main(String[] args) {

		int a, b, c;
		a = b = c = 3;
		c = a++ + --b * a;
		System.out.println(c);

		int x = 5;
		int y = 10;
		int z = ++x * y--;
		System.out.printf("x= %d\t y=%d\t z=%d\n", x, y, z);

		int year = 2020;
		System.out.println(year % 4 == 0 && year % 100 != 0 || year % 400 == 0);

	}

}
