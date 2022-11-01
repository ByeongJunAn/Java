package Day24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		String[] animals1 = { "사슴", "호랑이", "바다표범", "곰" };

		List<String> animals2 = Arrays.asList(animals1);
		animals2.set(1, "앵무새");
//		animals2.add("늑대");
		List<String> animals21 = new ArrayList<>();
		animals21.add("늑대");
		for (String s : animals21)
			System.out.print(s + " ");
		System.out.println();

		animals2.sort((x, y) -> x.length() - y.length());
		String[] animals3 = animals2.toArray(new String[0]);
		for (int i = 0; i < animals3.length; i++)
			System.out.print(animals3[i] + " ");
		System.out.println();

		List<String> car = List.of("그랜저", "소나타", "아반테", "제네시스");
//		car.set(1, "싼타페"); //of는 만들면 불변(값 변경 불가)하므로 밑의 값을 변경하는 set을 쓸 수 없다.
		car.forEach(s -> System.out.print(s + " "));

//		list<Object> object = List.of("a", null); //of는 null이 포함되면 안됨

	}

}
