package Day20_3;

public class GenericClassDemo {

	public static void main(String[] args) {
		Cup<Beer> c = new Cup<Beer>();
		Cup<Boricha> c2 = new Cup<Boricha>();
		c.setBeverage(new Beer());
		Beer b1 = c.getBeverage();

		Cup<Boricha> c3 = new Cup<>();
		Boricha c4 = c3.getBeverage();

	}

}
