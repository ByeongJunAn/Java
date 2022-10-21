package Day15_02;

public class NoteBook extends Computer implements Portable {

	@Override
	public void inMyBag() {
		System.out.println("가방에 넣은 노트북입니다.");

	}

	@Override
	public void turnOn() {
		System.out.println("노트북을 켭니다.");

	}

	public void turnOff() {
		System.out.println("노트북을 끕니다.");

	}

	public void repair() {
		System.out.println("노트북을 수리합니다.");
	}
}
