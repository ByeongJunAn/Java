package sec03;

import java.util.Scanner;

public class Tset6 {

	public static void main(String[] args) {

		int x, y, z; // x=시간 , y=분, z=초

		Scanner in = new Scanner(System.in);
		System.out.println("초 단위 정수를 입력하세요 : ");
		z = in.nextInt();

		x = z / 3600;
		y = z % 3600 / 60;
		z = z % 3600 % 60;

		System.out.println(x + "시간" + y + "분" + z + "초");

	}

}
