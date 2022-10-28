package Day21;

public class BoxContentsMover {
	public static void moveBox(Box<? super Toy> to, Box<? extends Toy> from) { // super는 set만, from은 get만 가능하다
		to.set(from.get());// from에 저장된 값을 to에 넣어준다.
	}
}
