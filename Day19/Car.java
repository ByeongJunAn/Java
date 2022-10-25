package Day19;

public class Car {

	private String model;

	public Car(String x) {
		model = x;

	}

	public String toString() {
		return model;

	}

	public boolean equals(Object obj) {
		if (this.model == ((Car) obj).model) {
			return true;
		} else
			return false;

	}

}
