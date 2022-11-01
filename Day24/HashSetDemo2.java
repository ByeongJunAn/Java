package Day24;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo2 {

	public static void main(String[] args) {
		Set<Fruit> fruits = new HashSet<>();
		fruits.add(new Fruit("사과"));
		fruits.add(new Fruit("사과"));
		System.out.println(fruits.size());
		System.out.println(fruits);

	}

}

/*
 * 원래라면 새로 객체를 각각 만들면 만들어진 두 객체는 다른 객체로 보기 때문에 fruits.add(new Fruit("사과")),
 * fruits.add(new Fruit("사과")) 이 두개는 다른 객체라고 해야한다. 하지만 Fruit class에 있는 equals
 * 내용에 의해 두 객체가 같은 객체로 정의 되게 됐는데
 * 
 * 이때에 set컬렉션의 hashset은 중복이 가능하지 않기 때문에 두번째 "사과"의 값은 들어갈 수 없게 된다. 따라서
 * System.out.println(fruits.size()); -> 1개만 나오고 System.out.println(fruits); ->
 * "사과" 한개만 나온다.
 */