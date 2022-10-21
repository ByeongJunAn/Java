package Day15_03;

public class MovableDemo {

	public static void main(String[] args) {
		Movable m = new Car();

		m.move(5);
//		m.show(); //movable이라는 리모컨이 car에 있는 show() 부분을 읽어 올 수 없기 때문에 

		Car c = (Car) m;
		c.move(100);
		c.show();

		System.out.println(); // 한칸 띄기

		Car cc = new Car();
		cc.move(500);
		cc.show();
	}

}
