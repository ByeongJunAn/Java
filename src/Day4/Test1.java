package Day4;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		double w;
		double h;

		Scanner in = new Scanner(System.in);

		System.out.println("직사각형의 가로 길이를 입력하세요 : ");
		w = in.nextDouble();

		System.out.println("직사각형의 세로 길이를 입력하세요 :");
		h = in.nextDouble();

		double area = (double) (w * h);
		System.out.println("직사각형의 넓이는" + area + "입니다");

	}

}
