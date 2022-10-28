package Day21;

public class EnglishScoreDemo {

	static <T> T findScore(T[] a, String name) throws Exception {
		T score = null;

		int i = 0;
		for (i = 0; i < a.length - 1; i++) {

			if (a[i].toString().substring(0, 3).equals(name)) {
				score = a[i];
				break;
			} else {
			}

		}
		if (score == null) {
			throw new Exception();
		}

		return score;

	}

	static <T extends Comparable<T>> T findBest(T[] a) {
		T best = a[0];
		for (int i = 1; i < 3; i++) {
			if (best.compareTo(a[i]) < 0)
				best = a[i];
		}
		return best;

	}

	public static void main(String[] args) {

		EnglishScore[] ea = { new EnglishScore("김삿갓", 77), new EnglishScore("장영실", 88), new EnglishScore("홍길동", 99) };
		MathScore[] ma = { new MathScore("김삿갓", 80), new MathScore("장영실", 98), new MathScore("홍길동", 70) };
		String name = null;

		System.out.println("영어 최고 점수 : " + findBest(ea));
		System.out.println("수학 최고 점수 : " + findBest(ma));

		// args에 이름이 없을 때 예외 처리 코드
		try {
			name = args[0];
			System.out.println("영어     점수 : " + findScore(ea, name));
			System.out.println("수학     점수 : " + findScore(ma, name));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("명령행 인자가 없습니다.");
		} catch (Exception e) {
			System.out.println("이름이 다릅니다.");
		}

//
	}

}
