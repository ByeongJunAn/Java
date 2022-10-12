package Day11;

public class Lotto2 {

	public static void main(String[] args) {
		int scores[] = new int[6];

		for (int i = 0; i < scores.length; i++)
			;

		while (true) {
			int num = (int) (Math.random() * 45) + 1;

			if (scores[0] == 0 && scores[0] != num) {
				scores[0] = num;

			} else if (scores[1] == 0 && scores[1] != num && scores[0] != num) {
				scores[1] = num;

			} else if (scores[2] == 0 && scores[2] != num && scores[1] != num && scores[0] != num) {
				scores[2] = num;

			} else if (scores[3] == 0 && scores[3] != num && scores[2] != num && scores[1] != num && scores[0] != num) {
				scores[3] = num;

			} else if (scores[4] == 0 && scores[4] != num && scores[3] != num && scores[2] != num && scores[1] != num
					&& scores[0] != num) {
				scores[4] = num;

			} else if (scores[5] == 0 && scores[5] != num && scores[4] != num && scores[3] != num && scores[2] != num
					&& scores[1] != num && scores[0] != num) {
				scores[5] = num;

			}
			if (scores[0] > 0 && scores[1] > 0 && scores[2] > 0 && scores[3] > 0 && scores[4] > 0 && scores[5] > 0)
				break;

		}
		System.out.printf("로또번호 : %d,%d,%d,%d,%d,%d", scores[0], scores[1], scores[2], scores[3], scores[4], scores[5]);
	}

}
