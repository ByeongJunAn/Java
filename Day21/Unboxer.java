package Day21;

public class Unboxer {
	public static <T> T openBox(Box<T> box) {
		return box.get();
	}

	public static <T> void peekBox(Box<T> box) { // 제네릭메서드
		System.out.println(box);

	}

	public static void peekBox2(Box<?> box) {// 와일드 카드(제네릭메서드 아님!)
		System.out.println(box);

	}

	public static void peekBox3(Box<? extends Number> box) { // 넘버와 넘버를 상속받은 후손들만 쓸 수 있다.
		System.out.println(box);

	}

	public static void peekBox4(Box<? super Integer> box) { // 인티저와 넘버의 조상들만 쓸 수 있다.
		System.out.print(box);
	}

}
