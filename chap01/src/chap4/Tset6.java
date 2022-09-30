package chap4;

import java.util.Scanner;

public class Tset6 {

	public static void main(String[] args) {

		int x, y, z; // x=시간 , y=분, z=초

		Scanner in = new Scanner(System.in);
		System.out.println("초 단위 정수를 입력하세요 : ");
		int time = in.nextInt();

		int hour = time / 3600; // 한시간이 3600초 이므로 time을 나눠주면 int값이라 소수점 아래는 없어지기 때문에 시간값만을 구할 수 있다.
		int minute = (time / 60) % 60; // 일분이 60초 이므로 time을 나눠주고 큰 수일 경우를 대비해 60으로 나머지 값을 구하면 minute을 구할 수 있다.
		int second = time % 60; // 일초는 time 값에서 60으로 나머지 값을 구하면 60단위의 값이 삭제 되고 남은 초를 구할 수 있다.

		System.out.println(hour + "시간" + minute + "분" + second + "초");

	}

}
