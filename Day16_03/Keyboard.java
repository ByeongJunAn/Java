package Day16_03;

public class Keyboard {
	String name;

	public Keyboard(String name) {
		this.name = name;
	}

	public boolean equals(Object obj) {

		if (obj instanceof Keyboard) {
			Keyboard k = (Keyboard) obj;

			if (name.equals(k.name)) {
				return true;
			}

		}
		return false;
	}

	public String ToString() {
		return "키보드입니다";
	}
}