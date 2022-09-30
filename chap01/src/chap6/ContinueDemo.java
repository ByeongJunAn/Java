package chap6;

public class ContinueDemo {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			// i는 0부터 9까지 진행되고 i는 +1씩 증가한다.
			if (i % 2 == 0)
				continue;
			// continue는 건너띄기를 말한다.
			// 여기서 if조건이 "짝수일때" 이므로 짝수는 건너띄어 져서 밑의 SOP에는 안나타난다

			System.out.println(i);
		}

	}

}
