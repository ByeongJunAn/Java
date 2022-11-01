package Day24;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		Collection<String> list = Arrays.asList("다람쥐", "개구리", "나비");

		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext())
			System.out.print(iterator.next() + "-");
		System.out.println();

//		while (iterator.hasNext())
//			System.out.print(iterator.next() + "+"); // 첫번째 while문에서 리스트를 사용했기 때문에
//														// 두번째 while문에선 리스트를 생성해주지 않는 한 사용 못함
//		System.out.println();

		for (String s : list) {
			System.out.print(s + "+");
		}
		System.out.println();

		iterator = list.iterator();
		while (iterator.hasNext())
			System.out.print(iterator.next() + "=");

	}

}
//결론 : 한번 리스트를 사용하면 다시 재사용은 못하므로 계속 생성해줘야 함
// iterator : 반복처리하는 애