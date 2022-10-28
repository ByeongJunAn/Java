package Day22;

public class OneParamReturn {

	public static void main(String[] args) {
		Printable02 p;

		p = new Printable02() {

			@Override
			public void print(String s) {
				System.out.println(s);

			}
		}; // 익명 클래스

		p = (String s) -> {
			System.out.println(s);
		};
		p = (s) -> System.out.println(s);
		p = s -> System.out.println(s);

		p.print("Lamda exp four");
	}

}
