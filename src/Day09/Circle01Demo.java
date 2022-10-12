package Day09;

public class Circle01Demo {

	public static void main(String[] args) {
		Circle01 c1 = new Circle01(10.0, "빨강");
		System.out.println(c1.radius + ", " + c1.color);

		Circle01 c2 = new Circle01(5.0);
		System.out.println(c2.radius + ", " + c2.color);
		Circle01 c3 = new Circle01("노랑");
		System.out.println(c3.radius + ", " + c3.color);
		Circle01 c4 = new Circle01();
		System.out.println(c4.radius + ", " + c4.color);
	}
}
