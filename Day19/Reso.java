package Day19;

public class Reso implements AutoCloseable {
	void show() {
		System.out.println("자원 사용");
	}

	public void close() throws Exception {
		System.out.println("자원 닫기");
	}

}
