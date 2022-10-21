package Day13;

public class Wrapping {

	public static void main(String[] args) {

		Box box1 = new Box();
		PaperBox box2 = new PaperBox();
		GoldPaperBox box3 = new GoldPaperBox();

		wrapBox(box1);
		wrapBox(box2);
		wrapBox(box3);

		box1.wrap();
		box2.wrap();
		box3.wrap();
	}

	private static void wrapBox(Box box) {
//		if (box instanceof GoldPaperBox) {
//			((GoldPaperBox) box).goldWrap();
//		} else if (box instanceof PaperBox) {
//			((PaperBox) box).paperWrap();
//		} else {
//			box.simpleWrap();
//		}

		if (box instanceof GoldPaperBox) {
			((GoldPaperBox) box).wrap();
		} else if (box instanceof PaperBox) {
			((PaperBox) box).wrap();
		} else {
			box.wrap();
		}
	}
//	box.wrap();

}
