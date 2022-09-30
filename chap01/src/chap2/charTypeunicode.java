package chap2;

public class charTypeunicode {

	public static void main(String[] args) {
		char ch1 = '헐';
		char ch2 = '확';

		char ch3 = 54736;
		char ch4 = 54869;
		char ch5 = 0xD5D0;
		char ch6 = 0xD655;

		char c1 = 'A';
		char c2 = 65;
		char c3 = '\u0041';
		String c4 = "A";

		System.out.println(ch1 + ch2);

		System.out.println(ch1 + " " + ch2);
		System.out.println(ch3 + " " + ch4);
		System.out.println((int) ch5 + " " + (int) ch6);

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);

		byte x = (byte) 314;
		System.out.println(x);
	}

}
