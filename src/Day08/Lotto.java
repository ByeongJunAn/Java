package Day08;

public class Lotto {

	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		int f = 0;

		while (true) {
			int num = (int) (Math.random() * 45) + 1;

			if (a == 0 && a != num) {
				a = num;

			} else if (b == 0 && b != num && a != num) {
				b = num;

			} else if (c == 0 && c != num && b != num && a != num) {
				c = num;

			} else if (d == 0 && d != num && c != num && b != num && a != num) {
				d = num;

			} else if (e == 0 && e != num && d != num && c != num && b != num && a != num) {
				e = num;

			} else if (f == 0 && f != num && e != num && d != num && c != num && b != num && a != num) {
				f = num;

			}
			if (a > 0 && b > 0 && c > 0 && d > 0 && e > 0 && f > 0)
				break;

		}
		System.out.printf("로또번호 : %d,%d,%d,%d,%d,%d", a, b, c, d, e, f);
	}

}
