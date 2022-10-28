package Day21;

public class WildCardUnboxer {

	public static void main(String[] args) {
		Box<String> box = new Box<>();
		box.set("So simple String");
		Unboxer.peekBox(box);
//		Unboxer.peekBox3(box);// peekBox3(Box<? extends Number> 라고 경고창이 뜨는데
//								 Unboxer.java의 peekbox3에 넘버로 제한 걸어놔서 쓸 수 없다고 알려줌
//		Unboxer.peekBox4(box); // 여기도 마찬가지로 String 이라서 불가

		Box<Integer> iBox = new Box<>();
		iBox.set(5959);
		Unboxer.peekBox2(iBox);
		Unboxer.peekBox3(iBox);
		Unboxer.peekBox4(iBox);

		Box<Double> dBox = new Box<>();
		dBox.set(123.456);
		Unboxer.peekBox2(dBox);
		Unboxer.peekBox3(dBox);
//		Unboxer.peekBox4(dBox);

	}

}
