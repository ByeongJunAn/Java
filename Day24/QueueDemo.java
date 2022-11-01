package Day24;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		Queue<String> q = new LinkedList<>();

//		q.remove(); //NoSuchElementException 만들어주지 않아서 지울게 없음

		System.out.println(q.poll()); // poll도 remove처럼 삭제를 의미하지만 아무것도 없다면 null값을 출력함
		q.offer("사과"); /*
						 * add와 같이 값을 추가하지만 offer는 추가에 성공하면 true, 실패하면 false를 반환하고 add는 성공하면 true, 실패하면
						 * IllegalStateException 발생
						 */
		System.out.println("바나나를 추가했나요?" + q.offer("바나나"));

		try {
			q.add("체리");
		} catch (IllegalStateException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("헤드 엿보기 : " + q.peek());
		String head = null; //

		try {
			head = q.remove();
			System.out.println(head + "제거하기");
			System.out.println("새로운 헤드 : " + q.element()); // element는 peek이랑 같은 애

		} catch (NoSuchElementException e) {
		}

		head = q.poll();
		System.out.println(head + "제거하기");
		System.out.println("새로운 헤드 : " + q.peek());

		System.out.println("체리를 포함하고 있나요? " + q.contains("체리"));
		System.out.println("사과를 포함하고 있나요? " + q.contains("사과"));

	}

}
