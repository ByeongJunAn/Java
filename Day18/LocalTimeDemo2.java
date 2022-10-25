package Day18;

import java.time.Duration;
import java.time.LocalTime;

public class LocalTimeDemo2 {

	public static void main(String[] args) {
		LocalTime start = LocalTime.of(14, 18, 30);

		System.out.println("pc방 이용 시작 시간 : " + start);
		// pc방의 이용 시작 시각 (현재시각)

		LocalTime end = LocalTime.of(15, 28, 10);
		System.out.println("pc방 이용 종료 시간 : " + end);
		// pc방의 이용 종료 시각 (마침시각)

		Duration between = Duration.between(start, end);
		System.out.println("pc방 이용 시간 :" + between.toMinutes() + "분");

		// pc방의 이용 시간( 두 시간의 차이)
	}

}
