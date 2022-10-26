package Day20_4;

public class BoxFactory02 {
	public <T> Box<T> makeBox(T o) {
		Box<T> box = new Box<>();
		box.set(o);
		return box;

	}

}
