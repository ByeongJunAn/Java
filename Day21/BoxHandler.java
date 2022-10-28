package Day21;

public class BoxHandler {
	public static void outBox(Box<Toy> box) {
		Toy t = box.get();
		System.out.println(t);
		box.set(new Toy()); // 1.1 : 컴파일러의 에러는 아니지만 논리적으로 'out'Box란 메서드에서 set을 쓰면 안되기 때문에 막을 필요가 있다.
	}

	public static void outBox2(Box<? extends Toy> box) {
		Toy t = box.get();
		System.out.println(t);
//		box.set(new Toy()); // 1.2 : 따라서 extends로 set이 불가능 하도록 extends로 막아 놓음

//	public static void outBox2(Box<? extends Robot> box) { // 위의 outBox2와 아래의 outBox2의 이름이 같고 타입이 달라도 오버라이딩 되지 않음 컴파일러가
//															// <>있는 내용을 지움
//
//		Toy t = box.get();
//		System.out.println(t);

	}

	public static <T> void outBox3(Box<? extends T> box) {
		T t = box.get();
		System.out.println(t);
//		box.set(new Toy());
	}

	public static void inBox(Box<Toy> box, Toy n) {
		box.set(n); // n을 박스에 넣는다.
//		Toy t = box.get(); 

	}

	public static void inBox2(Box<? super Toy> box, Toy n) { // extends와는 다르게 get이 안되게 막음
		box.set(n);
//		Toy t = box.get(); // super라서 불가능

	}

	public static <T> void inBox3(Box<? super T> box, T n) { // Toy 뿐만 아니라 Robot같은 애들도 가능
		box.set(n);
	}

}
