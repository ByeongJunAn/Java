package Day20;

import java.util.Scanner;

public class MyExceptionClass {

	public static void main(String[] args) {
		System.out.print("나이 입력 : ");
		int age;
		try {
			age = readAge();
			System.out.println("입력된 나이는 : " + age);

		} catch (ReadAgeException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

	private static int readAge() throws ReadAgeException { // throws -> 조상한테 에러를 던져 넘긴다.
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();

		if (age < 0 || age > 150)
			throw new ReadAgeException();
		return age;

//		if (age < 0)
//			throw new ReadAgeException(); // throw -> 에러 발생시키겠다
//		return age;

	}

}
