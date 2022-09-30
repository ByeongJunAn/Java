package chap2;

public class OperatePromotion {

	public static void main(String[] args) {

		short num1 = 11;
		short num2 = 22;
		short result1 = (short) (num1 + num2);
		int result2 = num1 + num2;

		System.out.println(result1);
		System.out.println(result2);

		int fifteen1 = 15;

		System.out.println("int형 변수 fifteen에 십진수 15를 할당 : " + fifteen1);

		byte fifteen2 = 0b1111;

		System.out.println("byte형 변수 fifteen2에 이진수 0b1111를 할당 : " + fifteen2);

		short fifteen3 = 017;

		System.out.println("short형 변수 fifteen에 팔진수 017를 할당 : " + fifteen3);

		int fifteen4 = 0xf;

		System.out.println("int형 변수 fifteen에 십육진수  0xf를 할당 : " + fifteen4);

		long lightSpeed = 300000L;

		System.out.println("long형 변수 lightSpeed에 L로 long타입을 명시하고 300000L를 할당 : " + lightSpeed);

	}

}
