package Day07;

public class Test12 {

	public static void main(String[] args) {

		System.out.println(factorial(5));
	}

//	문제 다음과 같은 프로그램이 있을때 factorial 메서드를 화살표 case를 가진 switch 문으로 작성하라
// 	public class FactorialTest{
//	public static void main(String[] args) {
//	System.out.prinln(factorial(5));
//	}
//	static int factorial(int n){
	// 코드 작성
//  }
//}

// (화살표 case를 가진 switch 문으로 작성)
//	static int factorial(int n) {
//		int b = 1;
//		int a = switch (i) {
//
//		case 0 -> 0;
//		case 1 -> 1;
//		default -> {
//			b = i * factorial(i - 1);
//
//			yield b;
//
//		}
//
//		};
//		return a;
//
//	}
//
//}

//	(재귀함수를 추가하여 작성)
//	static int factorial(int n) {
//		return switch (n) {
//		case 1 -> 1;
//		default -> n * factorial(n - 1);
//
//		};
//	}
//}

//	(일반 if문에 재귀함수를 추가하여 작성)
	static int factorial(int n) {
		if (n == 1)
			return 1;
		else {
			return n * factorial(n - 1);
		}
	};

}