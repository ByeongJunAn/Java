package Day27_2;

public class ThreadDemo {

	public static void main(String[] args) {
		Thread t = new Thread(new MyRunnable());
		t.start();

		new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.print("잘가. ");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
				}
			}
		}).start();

		for (int i = 0; i < 5; i++) {
			System.out.print("안녕.");
			try {
				Thread.sleep(500); // 0.5초씩 잠재움
			} catch (InterruptedException e) {
			}
		}
	}

}
