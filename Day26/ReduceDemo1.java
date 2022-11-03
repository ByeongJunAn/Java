package Day26;

import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

import Day25_3.Util;

public class ReduceDemo1 {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(3, 4, 5, 1, 2);

		int sum1 = numbers.stream().reduce(0, (a, b) -> a + b); // (1) 0+3 (2)3+4 (3)7+5 (4)12+1 (5)13+2
		int sum2 = numbers.stream().reduce(0, Integer::sum);
		int mul1 = numbers.stream().reduce(1, (a, b) -> a * b);

		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(mul1);

		Optional<Integer> sum3 = numbers.stream().reduce(Integer::sum);
		OptionalInt sum4 = numbers.stream().mapToInt(x -> x.intValue()).reduce(Integer::sum);
		Optional<Integer> mul2 = numbers.stream().reduce((a, b) -> a * b);
		System.out.println(sum3.get());
		System.out.println(sum4.getAsInt());
		mul2.ifPresent(Util::print);

	}

}
