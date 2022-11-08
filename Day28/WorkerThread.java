package Day28;

public class WorkerThread extends Thread { // 상속 받아 사용

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.print("잘가. ");
			try {
				Thread.sleep(500);

			} catch (InterruptedException e) {
			}
		}
	}
}
