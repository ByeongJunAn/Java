package Day12_Test;

import java.util.Scanner;

public class Grade2 {

	public static void main(String[] args) {
		int numOfStudnets = 0;
		int[] scores;

		System.out.println("학생수?");
		Scanner in = new Scanner(System.in);
		numOfStudnets = in.nextInt();
		scores = new int[numOfStudnets];

		System.out.println(numOfStudnets + "명의 학생 성적을 입력하세요");

		for (int i = 0; i < scores.length; i++) {
			scores[i] = in.nextInt();
		}
		numOfStudnets += 1;
		System.out.println(numOfStudnets + "명의 학생 성적은 다음과 같습니다.");

		for (int i = 0; i < scores.length; i++) {
			System.out.println(" " + scores[i]);

			if (scores[i] >= 90) {
				System.out.println((i + 1) + "번 학생의 등급은 A입니다.");

			}

			else if (scores[i] >= 80 && scores[i] < 90) {
				System.out.println((i + 1) + "번 학생의 등급은 B입니다.");
			} else if (scores[i] >= 70 && scores[i] < 80) {
				System.out.println((i + 1) + "번 학생의 등급은 C입니다.");
			}

			else if (scores[i] >= 60 && scores[i] < 70) {
				System.out.println((i + 1) + "번 학생의 등급은 D입니다.");
			} else {
				System.out.println((i + 1) + "번 학생의 등급은 F입니다.");
			}

			// for(int i : array)
		}

	}
}
