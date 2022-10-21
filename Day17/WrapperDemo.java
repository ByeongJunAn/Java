package Day17;

public class WrapperDemo {

	public static void main(String[] args) {
		Integer bi1 = new Integer(123);

		int i1 = bi1.intValue();
		double d = bi1.doubleValue();

		Integer bi2 = 20;
		int i2 = bi2 + 30;
		String s1 = Double.toString(3.14);
		Float pi = Float.parseFloat(s1);
		System.out.println(pi);
		Integer bi3 = Integer.valueOf("11", 16);

		System.out.println(bi3);

	}

}
