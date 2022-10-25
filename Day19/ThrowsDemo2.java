package Day19;

import java.util.Scanner;

public class ThrowsDemo2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		square(in.nextLine());
	}

	private static void square(String s) {
		try {
			int n = Integer.parseInt(s);
		} catch (NumberFormatException e) {
			System.out.println("정수가 아닙니다.");
		} finally {

			int n = Integer.parseInt(s);
			System.out.println(n * n);
		}
	}
}
