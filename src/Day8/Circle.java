package Day8;

public class Circle {
	double radius;

	double findArea() {
		return 3.14 * radius * radius;
	}

	void show(double x, double y) {
		System.out.printf("반지름 = %.1f, 넓이 = %.1f\n", x, y);

	}

}
