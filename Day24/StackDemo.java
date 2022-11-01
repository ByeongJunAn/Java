package Day24;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<String> s1 = new Stack<>();

		s1.push("사과"); // push : 넣기
		s1.push("바나나");
		s1.push("체리");

		System.out.println(s1.peek()); // peek : 꺼내지 않고 최상위에 있는 애 엿보기

		for (String s : s1) {
			System.out.println(s + " ");
		}
		System.out.println();

		System.out.println(s1.pop()); // pop : 꺼내서 알려달라 <-> push
		System.out.println(s1.pop());
		System.out.println(s1.pop());

		for (String s : s1) {
			System.out.println(s + " , "); // 위에서 값들을 다 빼냈기 때문에 결과로 아무것도 안나옴
		}
		System.out.println();

		Stack<Integer> s2 = new Stack<>();

		s2.add(10);
		s2.add(20);
		s2.add(1, 100);

		for (int value : s2)
			System.out.print(value + " ");
		System.out.println();

		while (!s2.empty())
			System.out.print(s2.pop() + " ");
	}

}
