package Day20;

import java.util.Scanner;

public class ThrowsDemo3 {

	public static void main(String[] args) throws NumberFormatException {
		Scanner in = new Scanner(System.in);
		square(in.nextLine());
	}

	private static void square(String s) {
		int n = 0;
		n = Integer.parseInt(s);
		System.out.println(n * n);
	}
}
