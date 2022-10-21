package Day07;

public class IncrementDemo {

	public static void main(String[] args) {
		int x = 0;
		System.out.println("increment() 메서드를 호출하기 전의 x는 " + x);
		int y = increment(x);
		System.out.println("incerment() 메서드를 호출한 후의 x는" + x);
		System.out.println("incerment() 메서드를 호출한 후의 y는" + y);

	}

	public static int increment(int i) {
		System.out.println("increment() 메서드를 시작할 때의 x은" + i);
		i++;
		System.out.println("increment() 메서드가 끝날 때의 x은 " + i);
		return i;
	}

}
