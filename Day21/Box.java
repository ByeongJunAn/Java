package Day21;

public class Box<T> {

	private T ob;

	public void set(T o) {
		ob = o;

	}

	public T get() {
		return ob;
	}

	public String toString() {
		return ob.toString();
	}

}
