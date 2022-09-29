package chap4;

public class AssignmentDemo {

	public static void main(String[] args) {
		int value1 = 1;
		value1 += 1;
		System.out.println("값 = " + value1);
		value1 -= 1;
		System.out.println("값 = " + value1);
		value1 <<= 3;
		System.out.println("값 = " + value1);
		value1 %= 3;
		System.out.println("값 = " + value1);

		int value2 = 1;
		value2 += 1; // value2 = value2 +1
		System.out.printf("값 = %d\n", value2);
		value2 -= 1; // value2 = value2 -1
		System.out.printf("값 = %d\n", value2);
		value2 <<= 3; // value2 = value2 <<3
		System.out.printf("값 = %d\n", value2);
		value2 %= 3; // value2 = value2 %= 3
		System.out.printf("값 = %d\n", value2);

		// printf의 지시자 : %d = 10진 정수
		// %x = 16진 정수
		// %f = 10진 실수
		// %c = 문자
		// %s = 문자열 출력
	}

}
