package Day20_2;

public class Generic {
	public static void main(String[] args) {
		Box<Apple> aBox = new Box<>();// 뒤의 <>에는 앞에 Apple를 넣어주면 뒤에는 논리적으로 당연히 Apple가 와야 하기 떄문에 컴파일러가 생략 가능하게 해줌
		Box<Orange> oBox = new Box<>();

		aBox.setOb(new Apple());
		oBox.setOb(new Orange());

//		aBox.setOb("apple");

		Apple ap = aBox.getOb();
		Orange og = oBox.getOb();

		System.out.println(ap);
		System.out.println(og);

	}
}
