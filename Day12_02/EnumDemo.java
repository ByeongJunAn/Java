package Day12_02;

public class EnumDemo {

	public static void main(String[] args) {
		Gender gender = Gender.FEMALE;
		if (gender == Gender.MALE) // 객체를 비교하는 것이므로 ==를 써도 된다.
			System.out.println(Gender.MALE + "은 병역 의무가 있다");
		else
			System.out.println(Gender.FEMALE + "은 병역 의무가 없다");

//		if (gender == Direction.SOUTH)
//			System.out.println(Direction.SOUTH + "는 누구?");
//		gender = 5; ㅡ> gender에 5가 없기 때문에 들어갈 수 없다.

	}

}

//enum Gender {
//	MALE, FEMALE
//}

enum Direction {
	EAST, WEST, SOUTH, NORTH
}