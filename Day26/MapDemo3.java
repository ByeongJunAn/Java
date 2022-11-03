package Day26;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import Day25_3.Util;

public class MapDemo3 {

	public static void main(String[] args) {

		List<String> list1 = List.of("안녕, 자바!", "잘 가, c++!");
		Stream<String> s1 = list1.stream();
		Stream<String> s2 = s1.flatMap(s -> Arrays.stream(s.split(" ")));
		s2.forEach(Util::printWithParenthesis);
		System.out.println();

		List<String> list2 = List.of("좋은 아침");
		List<String> list3 = List.of("안녕! 람다", "환영! 스트림");

		Stream<List<String>> s3 = Stream.of(list1, list2, list3); // list의 list이기 때문에 <List<String>>dmfh TMsek.

		Stream<String> s4 = s3.flatMap(list -> {
			if (list.size() > 1) // list의 길이가 1보다 큰가?
				return list.stream();
			else {
				return Stream.empty(); // list2("좋은 아침")의 길이가 1이기 떄문에 이곳으로 들어와 삭제된다.
			}
		});
		s4.forEach(Util::printWithParenthesis);

	}

}
