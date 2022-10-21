package Day16_02;

public class CountableTest {

	public static void main(String[] args) {
		Countable[] m = { new Tree("사과나무"), new Bird("뻐꾸기"), new Bird("독수리"), new Tree("밤나무") };

		for (Countable e : m) {
			e.count();
		}

		for (int i = 0; i < m.length; i++) {
			if (m[i] instanceof Bird) { // 배열에 있는 타입m[i]과 instanceof 뒤에 있는 값을 비교하여 같은지 아닌지 확인하는데 같다면 14줄로, 다르다면 else줄로
										// 간다.
				((Bird) m[i]).fly(); // 예를 들어 첫번째 번지에 있는 new Tree와 Tree 클래스를 비교하면 같은 클래스 이기 때문에 true를 반환함 그래서 m의 값인
										// countable의 fly()를
				// 호출해야 하는데 countable에는 fly값이 없다. 그러므로 Bird 리모콘을 이용(타입변환)하여 fly 값을 찾는다.
				// 문제 : 만약 m[1]에 있는 값이 countable 이라면? true를 반환할지? false를 반환할지?
				// 정답은 true를 반환한다. 왜냐하면 countable에 bird라는 자식이 상속시켜주기 때문에 fly()값을 갖고 있기 때문이다.

			} else {
				((Tree) m[i]).ripen();
			}
		}
		// a instanceof b
		// true, false
		// instanceof는 a값과 b값을 비교해서 형변환 할 수 있는지 확인하려고 쓴다.
	}
}

//	((Bird) m[i]).fly();
//((Tree) m[i]).ripen();