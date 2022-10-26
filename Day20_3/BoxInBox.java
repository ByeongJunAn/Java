package Day20_3;

import Day20_2.Box;

public class BoxInBox {

	public static void main(String[] args) {
		Box<String> sBox = new Box<>();
		sBox.setOb("I am so happy");

		Box<Box<String>> wBox = new Box<>();
		wBox.setOb(sBox);

		Box<Box<Box<String>>> zBox = new Box<>();
		zBox.setOb(wBox);

		System.out.println(zBox.getOb().getOb().getOb());
	} // sBox //wBox // zBox

}
