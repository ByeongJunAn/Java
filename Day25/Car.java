package Day25;

public class Car {
	private String model;
	private String color;

	public Car(String model, String color) {
		this.model = model;
		this.color = color;
	}

	@Override
	public String toString() {
		return "Car [model =" + model + ", color=" + color + "]";
	}

	public int hashCode() {
		return (model.hashCode() + color.hashCode()) / 2;
	}

	public boolean equals(Object object) {
		String m = ((Car) object).model;
		String c = ((Car) object).color;

		if (model.equals(m) && color.equals(c))
			return true;
		else
			return false;

	}

}
