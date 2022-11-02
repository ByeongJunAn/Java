package Day25;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		Set<String> set = Set.of("포도", "수박", "사과", "키위", "망고");
		HashSet<String> hashSet = new HashSet<>(set); // 정해진 순서가 없음
		System.out.println(hashSet);
		TreeSet<String> fruits = new TreeSet<>(set); // 사전순으로 순서가 정해짐
		System.out.println(fruits);

		System.out.println(fruits.first()); // 맨 앞에 있는애?
		System.out.println(fruits.last()); // 맨 뒤에 있는애?
		System.out.println(fruits.lower("사과")); // 사과보다 앞에 있는애?
		System.out.println(fruits.higher("사과")); // 사과보다 뒤에 있는애?

	}
}
