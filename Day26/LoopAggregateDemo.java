package Day26;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import Day25_3.Nation;
import Day25_3.Util;

public class LoopAggregateDemo {

	public static void main(String[] args) {
		Stream<Nation> sn = Nation.nations.stream().peek(Util::printWithParenthesis);

		System.out.println("어디 나타날까?");
		Optional<Nation> on = sn.max(Comparator.comparing(Nation::getPopulation));// 인구가 가장 큰 국가
		System.out.println();
		System.out.println(on.get()); // 여기서 on.get은 toString과 같다

		System.out.println(IntStream.of(5, 1, 2, 3).min().getAsInt());

		sn = Nation.nations.stream();
		System.out.println(sn.count());

	}

}
