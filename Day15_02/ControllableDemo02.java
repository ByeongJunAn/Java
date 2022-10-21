package Day15_02;

public class ControllableDemo02 {

	public static void main(String[] args) {
		Controllable[] ControllableDemo02 = { new Tv(), new Computer(), new NoteBook() };

		for (Controllable c : ControllableDemo02)
			Controll(c);
	}

	private static void Controll(Controllable c) {
		c.turnOn();
		c.turnOff();
		c.repair();
	}

}

//		for (Controllable c : ControllableDemo02) {
//			c.turnOn();
//			c.turnOff();
//			c.repair();
//			System.out.println(); // 한줄 띄기
//		}
//		Controllable.reset();
