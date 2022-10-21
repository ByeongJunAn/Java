package Day11;

public class Lotto {

	public static void main(String[] args) {
		int[] lottos = new int[6];
		int count = 0;

		while (count < lottos.length) {
			int num = (int) (Math.random() * 45) + 1;
			for (int i = 0; i < lottos.length; i++) {
				if (lottos[i] == num) {
					break;

				}

				if (lottos[i] != num && lottos[i] == 0) {
					lottos[i] = num;
					count++;
					break;
				}
			}

		}
		for (int lotto : lottos) {
			System.out.print(lotto + " ");
		}
	}
}
