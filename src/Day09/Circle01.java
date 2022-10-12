package Day09;

class Circle01 {
	double radius;
	String color;

	public Circle01(double r, String c) {

		radius = r;
		color = c;
	}

	public Circle01(double r) {
		this(r, "파랑");
//		radius = r;
//		color = "파랑";
	}

	public Circle01(String c) {
		this(10.0, c);
//		radius = 10.0;
//		color = c;
	}

	public Circle01() {
		this(10.0, "빨강");

//		radius = 10.0;
//		color = "빨강";
	}
}

//public class Circle04Test {
//	public static void main(String[] args) {
//		Circle04 c1 = new Circle04(10.0, "빨강");
//		System.out.println(c1.radius + ", " + c1.color);
//
//		Circle04 c2 = new Circle04(5.0);
//		System.out.println(c2.radius + "," + c2.color);
//		Circle04 c3 = new Circle04("노랑");
//		System.out.println(c3.color + "," + c3.radius);
//		Circle04 c4 = new Circle04();
//		System.out.println(c4.radius + "," + c4.color);
//	}
//}
