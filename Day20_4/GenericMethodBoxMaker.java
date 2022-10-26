package Day20_4;

import Day20_2.Apple;

public class GenericMethodBoxMaker {

	public static void main(String[] args) {
		BoxFactory02 bf = new BoxFactory02();
		Box<String> sBox = bf.makeBox("Sweet");
		System.out.println(sBox.get());

		Box<Double> dBox = bf.makeBox(7.59);
		System.out.println(dBox.get());

		Box<Apple> aBox = bf.makeBox(new Apple());
		System.out.println(aBox.get());
	}

}
