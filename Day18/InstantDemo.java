package Day18;

import java.time.Duration;
import java.time.Instant;

public class InstantDemo {

	public static void main(String[] args) {
		Instant start = Instant.now();

		System.out.println("시작 시각 : " + start.getEpochSecond());
		System.out.println("Time files like an arrow. ");

		for (int i = 0; i < 8038486; i++) {

		}

		Instant end = Instant.now();

		System.out.println("마침 시각 : " + end.getEpochSecond());

		Duration between = Duration.between(start, end);
		System.out.println("시각차(밀리 초) : " + between.toMillis());
	}

}
