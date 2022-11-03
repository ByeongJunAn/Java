package Day26;

import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import Day25_3.Nation;
import Day25_3.Util;

public class MatchDemo {

	public static void main(String[] args) {

		boolean b1 = Stream.of("a1", "b2", "c3").anyMatch(s -> s.startsWith("c"));// c로 시작하는애 찾아와
		System.out.println(b1);
		boolean b2 = IntStream.of(10, 20, 30).allMatch(p -> p % 3 == 0);// 한개 밖에 없어서 false
		System.out.println(b2);

		boolean b3 = IntStream.of(1, 2, 3).noneMatch(p -> p == 3); // noneMatch: 3인것이 없으면
		System.out.println(b3);

		if (Nation.nations.stream().allMatch(d -> d.getPopulation() > 100.0))// d.getPopulation(): 인구가 100(1억)을 넘으면
			System.out.println("모든 국가의 인구가 1억이 넘는다.");

		else {
			System.out.println("모든 국가의 인구가 1억이 넘지 않는다.");

			Optional<Nation> nation = Nation.nations.stream().findFirst(); // findFirst 는 무조건 처음꺼 가져옴
			nation.ifPresentOrElse(Util::print, () -> System.out.println("없음"));// 있으면 해당하는 값 프린트, 없으면 "없음" 출력
			System.out.println();

			nation = Nation.nations.stream().filter(x -> x.isIsland()).findAny(); // findAny cpu가 데이터를 처리하면서 먼저 읽히는 애를
																					// 가져옴
																					// 가져옴
//			nation = Nation.nations.stream().filter(Nation::isIsland).findAny(); //위의 내용과 같다.
			nation.ifPresent(Util::print);
		}
	}

}
