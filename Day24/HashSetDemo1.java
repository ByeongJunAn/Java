package Day24;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetDemo1 {

	public static void main(String[] args) {
		String[] fruits = { "사과", "바나나", "포도", "수박" };
		Set<String> h1 = new HashSet<>();
		Set<String> h2 = new HashSet<>();

		for (String s : fruits)
			h1.add(s);

		System.out.println("1단계 : " + h1); // set의 경우 순서가 정해져 있지 않다.

		h1.add("바나나"); // set 컬렉션은 add시 중복은 못넣음
		h1.remove("포도");
		h1.add(null);

		System.out.println("2단계 : " + h1);
		System.out.println(h1.size());
		System.out.println(h1.contains("수박"));

		List<String> list = Arrays.asList(fruits);
		h2.addAll(list);
		System.out.println("3단계 : " + h2);
		h2.clear();
		System.out.println(h2.isEmpty());

	}

}
