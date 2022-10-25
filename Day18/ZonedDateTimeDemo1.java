package Day18;

import java.time.Duration;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeDemo1 { // Zoned는 시차정보도 포함되어 있다

	public static void main(String[] args) {
		ZonedDateTime here = ZonedDateTime.now();
		System.out.println(here);

		ZonedDateTime paris = ZonedDateTime.of(here.toLocalDateTime(), ZoneId.of("Europe/Paris"));
		System.out.println(paris);

		Duration diff = Duration.between(here, paris);
		System.out.println(diff);

	}

}
