package Day5;

import java.util.Scanner;

public class MultiIfDemo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("점수를 입력해주세요");
		int x = in.nextInt();

		String grade;

		if (x >= 90) {
			grade = "A";

		}

		else if (x >= 80) {
			grade = "B";
		}

		else if (x >= 70) {
			grade = "C";

		}

		else if (x >= 60) {
			grade = "D";
		}

		else {
			grade = "F";

		}
		System.out.println("당신의 학점은" + grade + "입니다.");
	}

}
