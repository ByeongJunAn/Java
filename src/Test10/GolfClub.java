package Test10;

public class GolfClub {
	private int i = 0;
	private String a = "";

	public GolfClub() {
		i = 7; // i 값을 넣어주면 해결됨
	}

	public GolfClub(int in) {
		this.i = in;
	}

	public GolfClub(String name) {
		a = name;
	}

	public void print() {

		if (i >= 1) {
			System.out.println(i + "번 아이언 입니다.");
		} else {
			System.out.println(a + "입니다");
		}
	}

}
