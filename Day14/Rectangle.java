package Day14;

public class Rectangle extends Shape {
	private int witdh;
	private int height;

	public Rectangle(int width, int height) {
		this.witdh = witdh;
		this.height = height;

		return;
	}

	void draw() {
		System.out.println("사각형을 그리다.");

	}

	public double findArea() {
		return witdh * height;
	}

}
