package Day18;

import java.time.LocalDate;
import java.time.Period;

public class LocalDatePreiodDemo {

	public static void main(String[] args) {

		LocalDate today = LocalDate.now();

		System.out.println("오늘 날짜: " + today);
		// 오늘

		LocalDate xmas = LocalDate.of(today.getYear(), 12, 25);
		// 올해의 크리스마스

		Period left = Period.between(today, xmas);
		System.out.println("크리스마스까지 앞으로 : " + left);
		System.out.println("크리스마스까지 앞으로 : " + left.getMonths() + "월" + left.getDays() + "일");

		// 크리스마스까지의 일수

		LocalDate exam = LocalDate.of(today.getYear(), 11, 17);

		Period between = Period.between(today, exam);
		System.out.println("수능까지 앞으로 : " + between.getDays() + "일");
		// 올해의 수능 날짜 11/17
	}

}
