package Day28;

class JoinThread extends Thread {
	int total;

	public void run() {
		for (int i = 1; i <= 100; i++)
			total += i;
	}
}

public class JoinDemo {
	public static void main(String[] args) {

		JoinThread t = new JoinThread();
		t.start();

		try {
			t.join();
			System.out.println("스레드 t가 끝날때 까지 대기중...");
		} catch (InterruptedException e) {
			// TODO: handle exception
		}

		System.out.println("종합 : " + t.total);
	}
}