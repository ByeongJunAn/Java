package Day08;

public class Circle {
	private double radius;

	Circle() {
		this.radius = 0.0;
	}

	Circle(double radius) {
		this.radius = radius;
	}

	void setRadius(double radius) {
		if (radius > 0)
			this.radius = radius;
		else {
			System.out.println();
		}
	}

	double getRadius() {
		return this.radius;
	}

	double findArea() {
		return 3.14 * radius * radius;
	}

	void show(double x, double y) {
		System.out.printf("반지름 = %.1f, 넓이 = %.1f\n", x, y);

	}

}
