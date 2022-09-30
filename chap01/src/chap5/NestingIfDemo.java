package chap5;

import java.util.Scanner;

public class NestingIfDemo {

	public static void main(String[] args) {
		String grade;
		Scanner in = new Scanner(System.in);
		System.out.println("정수값을 입력하세요");
		int score = in.nextInt();

		if (score >= 90)
			grade = "A";
		else {
			if (score >= 80)
				grade = "B";
			else {
				if (score >= 70)
					grade = "C";
				else {
					if (score >= 60)
						grade = "D";
					else {
						grade = "F";
					}

				}
			}

			System.out.println("당신의 학점은" + grade);
		}
	}
}
