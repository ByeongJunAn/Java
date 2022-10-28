package Day21_2;

public class Rectangle implements Comparable<Rectangle> {
	private int width, heigth;

	public Rectangle(int width, int heigth) {
		this.width = width;
		this.heigth = heigth;
	}

	public int findArea() {
		return width * heigth;
	}

	public String toString() {
		return "사각형 [폭 =" + width + " , 높이" + heigth + "]";
	}

	@Override
	public int compareTo(Rectangle o) {
		return o.findArea() - findArea();
//		return findArea() - o.findArea();

	}

}
