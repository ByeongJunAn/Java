package Day25_2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SearchDemo {
	public static void main(String[] args) {

		String[] s = { "황금을", "돌", "같이", "보라" };
		List<String> list = Arrays.asList(s);

		Collections.sort(list); // sort 정렬을 해줘야 binarySearch를 사용할 수 있다.
		System.out.println(list);
		int i = Collections.binarySearch(list, "돌"); // 몇번지에 있는지 알려준다
		System.out.println(i);

	}
}
