package chap3;

public class casttest {

	public static void main(String[] args) {
//자동형변환
		double d1 = 5 * 3.14; // 5 -> 5.0 double
		double d2 = 1; // 1 -> 1.0
		int num1 = 50;
		long num2 = 3147483647L;
		System.out.println(num1 + num2); // 50 -> 50L

		System.out.println(59L + 34.5); // 59L -> 59.0

		// 명시적 형 변환
		float f1 = 3.14;
		// 3.14가 double이므로
		// (1) float를 double로 변환 (2) 3.14 뒤에 f를 붙여 float형으로 변환

		byte b1 = 300;
		// 300이 int이므로 byte를 int로 변환

		byte x1 = 3.14;
		// 3.14가 실수 이므로 byte를 double로 변환

		double d = 3.14f;

		double pi = 3.1415;

		int wholeNumber = pi;
		// pi가 실수이므로 int를 double 이나 float로 변환

		long num11 = 3000000007L;
		int num22 = num11;
		// num11이 long의 크기에 넘어가므로(오버플로우) int를 long으로 변환

		short num31 = 1;
		short num32 = 2;
		short num33 = num31 + num32;
//		short num33 = (short) (num31 + num32); 이건 num31과 num32를 먼저 계산하고 short로 변환하기 때문에 에러가 없음
//		short num33 = (short) num31 + num32; 이건 num31은 short지만 num32는 int이기 떄뭔에 계싼하면 int로 변환되므로 에러발생

	}

}
