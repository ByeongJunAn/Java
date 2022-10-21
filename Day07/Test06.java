package Day07;

public class Test06 {

	public static void main(String[] args) {

		System.out.println(factorial(5));
		System.out.println(factorial(1, 5));
		System.out.println(factorial(3, 5));
		System.out.println(factorial(10, 5));

	}

	public static int factorial(int x) {
		int r = 1;
		while (x > 0) {

			r = r * x;
			x--;

		}
		return r;
	}

	public static int factorial(int x, int y) {
		int r = 1;

//		while (x <= y) {
//			r = r * x;
//			x++;
//		}
		for (; x <= y; x++) {
			r = r * x;

		}
		return r;

	}

}

// 팩토리얼 값 뿐만 아니라 구간 팩토리얼 값을 계산하는 메서드를 오버로딩 해보자