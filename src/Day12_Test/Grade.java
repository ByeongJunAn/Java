package Day12_Test;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		int numOfStudnets = 0;
		int[] scores;

		System.out.println("학생수?");
		Scanner in = new Scanner(System.in);
		numOfStudnets = in.nextInt();
		scores = new int[numOfStudnets];

		System.out.println(numOfStudnets + "명의 학생 성적을 입력하세요");

		for (int i = 0; i < scores.length; i++)
			scores[i] = in.nextInt();

		System.out.println(numOfStudnets + "명의 학생 성적은 다음과 같습니다.");
		for (int i = 0; i < scores.length; i++)
			System.out.print(" " + scores[i]);

	}

}
