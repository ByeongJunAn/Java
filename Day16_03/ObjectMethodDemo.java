package Day16_03;

public class ObjectMethodDemo {

	public static void main(String[] args) {
		Mouse m1 = new Mouse("Logitech");
		System.out.println((m1.getClass()));

		System.out.println(m1);
		System.out.println(m1.toString());

		Keyboard k1 = new Keyboard("Microsoft");

		System.out.println(k1);
		System.out.println(k1.ToString());

		Mouse m2 = new Mouse("Logitech");
		System.out.println((m1.equals(m2)));
		Mouse m3 = m2;
		System.out.println(m2.equals(m3));

		Keyboard k2 = new Keyboard("Microsoft");
		System.out.println(k1.equals(k2));

		System.out.println(k2.name);

		String s1 = "Hello";
		System.out.println(s1);

	}

}
