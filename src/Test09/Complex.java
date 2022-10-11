package Test09;

public class Complex {
	private double a, b = 0;

	public Complex(double a) {
		this.a = a;

	}

	public Complex(double a, double b) {
		this.a = a;
		this.b = b;

	}

	public void print() {
		System.out.println(a + " + " + b + "i");

	}

}
