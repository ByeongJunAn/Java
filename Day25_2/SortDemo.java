package Day25_2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortDemo {

	public static void main(String[] args) {
		String[] fruits = { "포도", "복숭아", "망고", "사과", "샤인머스켓" };
		List<String> list = Arrays.asList(fruits); // 배열을 리스트로 만들어 list에 저장

		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);

		Collections.reverse(list);
		System.out.println(list);

	}

}
