package Day23;

@FunctionalInterface
interface UseThis {
	void use();
}

public class UseThisDemo {

	public void lambda() {
		String hi = "hi";

		UseThis u1 = new UseThis() {

			@Override
			public void use() {
				System.out.println(this);
//				hi = "Inner.."; //must be final or effectively final //final이란 단어를 안붙였지만 실질적으로 final을 사용하고 있다.
			}
		};

		u1.use();

		UseThis u2 = () -> {
			System.out.println(this);
//		hi = "Lambda";};
		};
		u2.use();
	}

	public String toString() {
		return "UseThisDemo";
	}

	public static void main(String[] args) {

		new UseThisDemo().lambda();

	}

}
