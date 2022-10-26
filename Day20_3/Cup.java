package Day20_3;

public class Cup<T extends Beverage> {
	private T b;

	public T getBeverage() {
		return b;
	}

	public void setBeverage(T b) {
		this.b = b;
	}

}
