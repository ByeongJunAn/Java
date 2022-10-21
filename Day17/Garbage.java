package Day17;

public class Garbage {

	public int no;

	public Garbage(int no) {
		this.no = no;
		System.out.printf("Garbage(%d) 생성\n", no);

	}

	protected void finalize() { // 생성 마지막까지 들렸다가 수거하라는 명령어
		System.out.printf("Garbage(%d) 수거\n", no);

	}

}
