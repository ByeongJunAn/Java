package Day7;

public class Test09 {

	public static void main(String[] args) {
		int a, b, c;

		for (a = 1; a <= 18; a++) {
			for (b = 1; b <= 18; b++) {
				for (c = 1; c <= 18; c++) {
					if (((a * a) + (b * b) == (c * c)) && (a + b + c <= 20)) {
						System.out.println("a=" + a + " b=" + b + " c=" + c);
					}
				}

			}

		}

	}

}

// 각 변의 길이 합이 20이하이며 각 변의 길이가 정수인 직각 삼각형의 모든 변을 구하라.
// 단, 피타고라스의 정리, 즉 a^2 + b^2 = c^2을 이용하고 for문을 중첩해서 사용한다.