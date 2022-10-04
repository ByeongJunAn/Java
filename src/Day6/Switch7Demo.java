package Day6;

import java.util.Scanner;

public class Switch7Demo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("점수를 입력해주세요");
		int x = in.nextInt();

		String grade;

		switch ((x / 10) * 10) {
		case 90:
			grade = "A";
			break;

		case 80:

			grade = "B";
			break;

		case 70:
			grade = "C";
			break;

		case 60:
			grade = "D";
			break;

		default:
			grade = "F";

		}
		System.out.println("당신의 학점은" + grade + "입니다.");
	}
}
