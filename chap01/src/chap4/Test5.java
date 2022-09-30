package chap4;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {

		double x;
		double y;
		double z;

		Scanner in = new Scanner(System.in);
		System.out.println("원기둥의 밑면 반지름은? : ");
		x = in.nextDouble();

		System.out.println("원기둥의 높이는? : ");
		y = in.nextDouble();

		z = (x * x * 3.14) * y;

		System.out.println("원기둥의 부피는 " + z);

	}

}
