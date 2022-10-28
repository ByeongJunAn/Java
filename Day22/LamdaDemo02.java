package Day22;

public class LamdaDemo02 {

	public static void main(String[] args) {
		Negative n;
		Printable p;

		n = new Negative() {

			@Override
			public int neg(int x) {
				// TODO Auto-generated method stub
				return -x;
			}
		};

		n = (int x) -> {
			return -x;
		};// return은 부호 바꾸는 역할
		n = (x) -> {
			return -x;
		};
		n = x -> {
			return -x;
		};
		n = (x) -> -x;
		n = x -> -x;

		p = new Printable() {

			@Override
			public void print() {
				System.out.println("Hi~~");

			}
		};

		p = () -> {
			System.out.println("Hi~~");
		};
		p = () -> System.out.println("Hi~~");
		p.print();

	}

}
