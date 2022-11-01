package Day24;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		List<String> list = List.of("그랜저", "소나타", "아반테", "제네시스", "소울");

		System.out.println(list.indexOf("소나타")); // 번지수
		System.out.println(list.contains("싼타페"));// 속해있는지

		List<String> cars1 = new LinkedList<>(list); // list기반 이기 때문에 list와 똑같이 만들어짐
		cars1.add("싼타페");
		List<String> cars2 = new LinkedList<>(list);
		cars2.remove("제네시스"); // ()안에 있는애를 지워줘
		System.out.println(cars1.containsAll(cars2));// 리턴형이 boolean이다.

		cars1.removeIf(c -> c.startsWith("소")); // "소"를 포함하는 애들 지워줘
		cars1.replaceAll(s -> "뉴" + s); // 전체를 다 "뉴" + s로 바꿔줘
		cars1.forEach(s -> System.out.print(s + " "));
		System.out.println();

		cars1.clear();
		System.out.println(cars1.isEmpty());

	}

}
