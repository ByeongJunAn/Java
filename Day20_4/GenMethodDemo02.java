package Day20_4;

public class GenMethodDemo02 {
	static class Utils {
		public static <T extends Number> void showArray(T[] a) {
			for (T t : a)
				System.out.printf("%s", t);
			System.out.println();

		}
	}

	public static void main(String[] args) {
		Integer[] ia = { 1, 2, 3, 4, 5 };
		Double[] da = { 1.0, 2.0, 3.0, 4.0, 5.0 };
		Character[] ca = { 'H', 'E', 'L', 'L', 'O' };

		Utils.showArray(ia);
		Utils.showArray(da);
//	Utils.<Character>showArray(ca); // 위에서 extends Number를 했기 때문에 character는 올 수 없다
	}

}
