package Day20_3;

import java.util.ArrayList;

public class GeneticInheritanceDemo {

	public static void main(String[] args) {
		ArrayList<Beverage> list1 = new ArrayList<>();
		list1.add(new Beer());
		beverageTest(list1);

		ArrayList<Beer> list2 = new ArrayList<>();
		list2.add(new Beer());
//		beverageTest(list2); // 배열로 보면 beverage 배열과 beer 배열은 다르므로 beer는 쓸 수 없다.
//		beverageTest(list2);

	}

	static public void beverageTest(ArrayList<Beverage> list1) {
//	static public void beverageTest(ArrayList<?> list) {

	}

}
