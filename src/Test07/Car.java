package Test07;

class Car {
	public static int countCar = 0;
	public static int countRedCar = 0;
	private String color;

	public Car() {
		countCar++;
	}

	public Car(String color) {
		this.color = color;
		countCar++;
		if (color.equalsIgnoreCase("red")) {
			// color.equals("red") || color.equals("Red"))
			countRedCar++;

		}
	}

	public static int getNumOfCar() {
		return countCar;
	}

	public static int getNumOfRedCar() {
		return countRedCar;
	}
}
