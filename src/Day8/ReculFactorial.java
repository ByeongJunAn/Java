package Day8;

public class ReculFactorial {

	public static void main(String[] args) {
		System.out.println(factorial(5));
		System.out.println(factorial(7));
	}

	public static int factorial(int i) {

		if (i == 1)
			return 1;

		else
			return i * factorial(i - 1);
	}

}
