package Day11;

public class VarArgsDemo {

	public static void main(String[] args) {
		printSum("+", 1, 2, 3, 4, 5);
		printSum("-", 10, 20, 30);
		// format과 join도 가변 매개변수를 사용하는 메소드이다.
		System.out.println(String.format("My score is %.1f", 99.8));
		System.out.println(String.join(",", "one", "two", "three"));

	}

//	 가변 변수 매개변수는 1개만 쓸 수 있다.
//	매개 변수를 2개이상 쓸 경우 가변갯수 매개변수는 맨 마지막에 둔다.
	public static void printSum(String op, int... v) {
		int sum = 0;
		for (int i : v) {
			if (op.equals("+"))
				sum += i;
			else
				sum -= i;
		}

//			sum += i;

		System.out.println(sum);

	}

}
