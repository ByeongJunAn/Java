package Day18;

import java.time.LocalDateTime;

public class LocalDateTimeDemo {

	public static void main(String[] args) {
		LocalDateTime date = LocalDateTime.now();
		System.out.println(date);
		// 현재 날짜와 시간
		LocalDateTime dt = date.plusHours(22);
		dt = dt.plusMinutes(45);
		// 22시간 45분 후
		System.out.println(dt);

	}

}
