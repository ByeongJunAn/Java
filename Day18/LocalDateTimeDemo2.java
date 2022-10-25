package Day18;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;

public class LocalDateTimeDemo2 {

	public static void main(String[] args) {
		// 현재시각 2022.4.25 10:20분
		LocalDateTime dt = LocalDateTime.of(2022, 4, 25, 10, 20);
		System.out.println("현재 시각: " + dt);

		// 항공 1편의 출발 시간 2022.6.23 11:30
		LocalDateTime air1 = LocalDateTime.of(2022, 6, 23, 11, 30);
		System.out.println("항공 1편 출발 시간 : " + air1);

		LocalDateTime air2 = LocalDateTime.of(2022, 6, 22, 17, 30);
		System.out.println("항공 2편 출발 시간 : " + air2);
		// 항공 2편의 출발 시간 2022.6.22 17:30

		// 빠른 항공편을 선택하는 과정
		LocalDateTime myair;
		if (air1.isBefore(air2)) {
			myair = air1;
		} else {
			myair = air2;
		}

		// 빠른 항공편의 비행 탑승시간까지 남은 날짜 계산
		Period day = Period.between(dt.toLocalDate(), myair.toLocalDate());
		System.out.println("빠른 항공편의 비행 탑승까지 남은 날짜: " + day);

		// 빠른 항공편의 비행 탑승까지 남은 시간 계산
		Duration time = Duration.between(dt.toLocalTime(), myair.toLocalTime());
		System.out.println("빠른 항공편의 비행 탑승까지 남은 시간: " + time);

		// 비행 탑승까지 남은 날짜와 시간 출력
		System.out.print(day);
		System.out.println(time);
	}

}
