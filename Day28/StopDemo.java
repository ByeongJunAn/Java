package Day28;

public class StopDemo {

	public static void main(String[] args) {
		StopThread t = new StopThread();
		t.start();

		try {
			Thread.sleep(3);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		t.stop = true;

	}

}
