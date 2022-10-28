package Day21;

public class BoundWildcardBase {

	public static void main(String[] args) {
		Box<Toy> box = new Box<>();
		BoxHandler.inBox(box, new Toy());// Toy를 넣어줘야 하는데 아직 만들어 놓은게 없기 떄문에 new 를 써준다.
		BoxHandler.outBox(box);

		Box<Robot> rBox = new Box<>();
//		BoxHandler.inBox(rBox, new Robot());
//		BoxHandler.outBox(rBox);
//		BoxHandler.inBox2(rBox, new Robot());
//		BoxHandler.outBox(rBox);
	}

}
