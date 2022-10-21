package Day15;

public class Circle {
	int radius;

	public Circle(int radius) { // 생성자를 써야 하는데 void를 쓰면 메서드가 되기 때문에 void를 쓰지 않도록 주의 한다.
		this.radius = radius;
	}

	void show() {
		System.out.println("반지름이 " + radius + "인 원이다.");
	}

}
