package Day07;

public class Test11 {

	public static void main(String[] args) {
		foo("안녕", 1);
		foo("안녕하세요", 1, 2);
		foo("잘있어");

	}

	public static void foo(String a, int b, int c) {

		System.out.println(a + b + c);

		return;
	}

	public static void foo(String a) {

		System.out.println(a);
		return;
	}

	public static void foo(String a, int b) {

		System.out.println(a + b);

	}
}
