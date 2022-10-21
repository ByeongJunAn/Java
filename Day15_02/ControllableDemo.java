package Day15_02;

public class ControllableDemo {

	public static void main(String[] args) {
		Tv tv = new Tv();
		Computer com = new Computer();

		tv.turnOn();
		tv.turnOff();
		tv.repair();

		com.turnOn();
		com.turnOff();
		com.repair();

		Controllable.reset();

	}

}
