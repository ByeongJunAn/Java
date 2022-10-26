package Day11;

public class Circle {
	double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	double findArea() {

		return 3.14 * this.radius * this.radius;
	}

	public double getRadius() {
		return this.radius;
	}

	public static void main(String[] args) {
		Circle[] circles = new Circle[5];

		for (int i = 0; i < circles.length; i++) {
			circles[i] = new Circle(i + 1.0);
			System.out.printf("원의 넓이(반지름 : %.1f) = %.2f\n", circles[i].getRadius(), circles[i].findArea());
		}

	}

	public void setRadius(double d) {
		// TODO Auto-generated method stub

	}

}