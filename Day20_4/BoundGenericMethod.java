package Day20_4;

public class BoundGenericMethod {

	public static void main(String[] args) {
		Box<Integer> sbox = BoxFactory.makeBox(5959);
		int n = sbox.get();
		System.out.println(n);
		Box<Double> dbox = BoxFactory.makeBox(5959.5959);
		Double dn = dbox.get();
		System.out.println(dn);

	}

}
