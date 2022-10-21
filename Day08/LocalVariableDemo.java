package Day08;

public class LocalVariableDemo {

	public static void main(String[] args) {
		int a = 0;
		double b;

//		System.out.print(b); 초기화 필요
//		System.out.print(a+c); c값이 밑에 선언되어 있어서 에러

		int c = 0;

//		public double d = 0.0; 하나의 클래스 파일에 두개 이상의 퍼블릭 클래스가 존재하면 안됨 -> 각 클래스를 별도의 소스파일에 나눠서 저장하거나 둘 중의 한 클래스에 public을 안붙이면 된다.

		for (int e = 0; e < 10; e++) {
//			int a = 1; 맨 앞에 a가 이미 선언됨 
			System.out.println(e);
		}
	}

}
