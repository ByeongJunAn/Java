package Day28;

public class InterruptDemo1 {

	public static void main(String[] args) {
		Runnable task = () -> {
			try {
				while (true) { // 무한 반복
					System.out.println("실행 중...");
					Thread.sleep(1);
				}

			} catch (InterruptedException e) {
				// TODO: handle exception
			}
			System.out.println("정상 종료");

		};

		Thread t = new Thread(task);
		t.start();

		try {
			Thread.sleep(3);
		} catch (InterruptedException e) {
		}
		t.interrupt(); // 무한 반복하는걸 종료 시킴

	}

}
