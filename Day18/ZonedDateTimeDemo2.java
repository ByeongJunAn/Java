package Day18;

import java.time.Duration;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeDemo2 {

	public static void main(String[] args) {
		ZonedDateTime start = ZonedDateTime.of(2022, 12, 9, 13, 20, 10, 0, ZoneId.of("Asia/Seoul"));
		System.out.println("한국 출발 현지 시간 " + start);
		// 한국 출발 현지 시간 2022년 12월 9일 13시 20분

		ZonedDateTime end = ZonedDateTime.of(2022, 12, 9, 17, 20, 0, 0, ZoneId.of("Europe/Paris"));
		System.out.println("프랑스 도착 현지 시간" + end);
		// 프랑스 도착 현지 시간 2022년 12월 9일 17시 20분

		Duration diff = Duration.between(start, end);
		System.out.println("비행에 걸린 시간은? " + diff);
		// 비행에 걸린 시간은?
	}

}
