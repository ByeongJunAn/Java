package Day09;

public class CircleStatic {
	double radius;
	static int numOfCircles = 0;
	int numCircles = 0;

	public CircleStatic(double radius) {
		this.radius = radius;
		numOfCircles++;
		numCircles++;

	}
}
