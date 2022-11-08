package Day28;

import java.util.Random;

public class SharedCar {
	public synchronized void drive(String name, String where) { // car가 공유자원이기 때문에 싱크로나이즈를 줘서 한번에 하나씩만 쓸 수 있게 제한 검
//		public void drive(String name, String where) { //자동차는 한 대 인데 세명 모두 자동차에 타고, 동시에 운전하고, 도착하는 오류 발생하므로 synchronized로 막아야 한다.
		System.out.println(name + "님이 자동차에 탔습니다.");
		Random r = new Random();
		for (int i = 0; i < r.nextInt(3) + 1; i++)
			System.out.println(name + "님이 자동차를 운전합니다.");
		System.out.println(name + "님이" + where + "에 도착했습니다.");

	}

}
