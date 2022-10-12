package Day08;

public class CircleDemo {

	public static void main(String[] args) {
		Circle myCircle = new Circle(10.0);

//		myCircle.radius = 10.0;
//		myCircle.setRadius(10.0);
		myCircle.setRadius(-10.0);
		myCircle.show(myCircle.getRadius(), myCircle.findArea());
	}
}
