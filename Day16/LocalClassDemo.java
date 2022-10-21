package Day16;

public class LocalClassDemo {
	private String s1 = "외부";

	void method() {
		int x = 1; // 지역변수
		class LocalClass { // 지역 클래스
			String s2 = "내부";
			String s3 = s1;

			public void show() {
				System.out.println("지역 클래스" + x); // 출력은 가능하지만 x값을 바꿀 순 없음 ㅡ> final로 번역이 된다
//				x=2;  // x가 지역클래스를 벗어나 있어서 오류 발생 
			}
		}

		LocalClass lc = new LocalClass();
		System.out.println(lc.s2);
		lc.show();

	}

	public static void main(String[] args) {
		LocalClassDemo lcd = new LocalClassDemo();
		lcd.method();
	}

}
