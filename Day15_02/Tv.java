package Day15_02;

public class Tv implements Controllable {

	@Override
	public void turnOn() {
		System.out.println("Tv를 켠다.");

	}

	@Override
	public void turnOff() {
		System.out.println("Tv를 끈다.");

	}

}
