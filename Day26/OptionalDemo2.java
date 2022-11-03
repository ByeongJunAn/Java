package Day26;

import java.util.Optional;

import Day25_3.Util;

public class OptionalDemo2 {

	public static void main(String[] args) {
		String s1 = "안녕"; // or String s1 = null;
		Optional<String> o = Optional.ofNullable(s1);

		if (s1 != null)
			Util.print(s1);
		else {
			Util.print("없음");
		}
		if (o.isPresent()) // 값이 있으면 출력
			Util.print(o.get());
		else {
			Util.print("없음");
		}

		String s2 = o.orElse("없음"); // 값 있으면 값그대로, 없으면 "없음"출력
		Util.print(s2);

		o.ifPresentOrElse(Util::print, () -> System.out.println("없음")); // 있으면 앞에꺼 처리(util::print 출력), 없으면 뒤에거
																		// 처리(()->"없음" 출력)

	}

}
