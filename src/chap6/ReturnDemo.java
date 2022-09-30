package chap6;

public class ReturnDemo {

	public static void main(String[] args) {
		printScore(99);
		printScore(120);
	}

	public static void printScore(int score) {
		if (score < 0 || score > 100) {
			System.out.println(("잘못된 점수 : " + score));
			return;// 제어변경을 위해 사용
		}
		System.out.println("점수 : " + score);

	}

}
