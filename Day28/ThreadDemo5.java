package Day28;

public class ThreadDemo5 {

	public static void main(String[] args) {
		new Thread() {
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.print("잘가. ");

				}
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
				}
			}
		}.start();

		for (int i = 0; i < 5; i++) {
			System.out.print("안녕. ");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
		}
	}

}
