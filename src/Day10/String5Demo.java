package Day10;

public class String5Demo {

	public static void main(String[] args) {
		String version = String.format("%s %d", "JDK", 14);
		System.out.println(version);

		String fruits = String.join(", ", "apple", "banana", "cherry", "durian");
		System.out.println(fruits);

		boolean sw = true;
		String pi = String.valueOf(3.14); // 기본 자료형을 String값으로 변환시킨다.
		System.out.println(sw); // boolean true 값을 String true로 바꿈

	}

}
