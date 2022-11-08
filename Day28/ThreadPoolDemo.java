package Day28;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {

	public static void main(String[] args) {

		Runnable task = () -> {
			for (int i = 0; i < 5; i++) {
				System.out.print("잘가. ");
				try {
					Thread.sleep(500);
				} catch (Exception e) {
				}
			}

		};

		ExecutorService exec = Executors.newCachedThreadPool(); // 작업 수에 맞게 유동적으로 갯수를 늘리거나 줄여서 만듬
//		ExecutorService exec2 = Executors.newFixedThreadPool(4);
//		exec.execute(task);
		exec.submit(task);

		for (int i = 0; i < 5; i++) {
			System.out.print("안녕. ");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}
		exec.shutdown(); // 다 써서 반납의 의미로 셧다운 해줘야 함 , 안해주면 쓰레드가 죽질 않음

	}
}
