package Day12_Test;

import java.util.Scanner;

public class Grade3 {

	public static void main(String[] args) {
		int numOfStudnets = 0;
		int[] scores;

//		GreadeEnum gread1 = GreadeEnum.최우수;
//		GreadeEnum gread2 = GreadeEnum.우수;
//		GreadeEnum gread3 = GreadeEnum.보통;
//		GreadeEnum gread4 = GreadeEnum.미흡;
//		GreadeEnum gread5 = GreadeEnum.탈락;

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
				System.out.println((i + 1) + "번 학생의 등급은 " + GreadeEnum.최우수 + "입니다.");

			}

			else if (scores[i] >= 80 && scores[i] < 90) {
				System.out.println((i + 1) + "번 학생의 등급은 " + GreadeEnum.우수 + "입니다.");
			} else if (scores[i] >= 70 && scores[i] < 80) {
				System.out.println((i + 1) + "번 학생의 등급은 " + GreadeEnum.보통 + "입니다.");
			}

			else if (scores[i] >= 60 && scores[i] < 70) {
				System.out.println((i + 1) + "번 학생의 등급은 " + GreadeEnum.미흡 + "입니다.");
			} else {
				System.out.println((i + 1) + "번 학생의 등급은 " + GreadeEnum.탈락 + "입니다.");
			}

//			if (scores[i] >= 90) {
//				System.out.println((i + 1) + "번 학생의 등급은 " + GreadeEnum.A + "입니다.");
//
//			}
//
//			else if (scores[i] >= 80 && scores[i] < 90) {
//				System.out.println((i + 1) + "번 학생의 등급은 " + GreadeEnum.B + "입니다.");
//			} else if (scores[i] >= 70 && scores[i] < 80) {
//				System.out.println((i + 1) + "번 학생의 등급은 " + GreadeEnum.C + "입니다.");
//			}
//
//			else if (scores[i] >= 60 && scores[i] < 70) {
//				System.out.println((i + 1) + "번 학생의 등급은 " + GreadeEnum.D + "입니다.");
//			} else {
//				System.out.println((i + 1) + "번 학생의 등급은 " + GreadeEnum.F + "입니다.");
//			}

			// for(int i : array)
		}

	}
}
