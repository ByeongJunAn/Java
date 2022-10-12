package Day10;

public class Test {

	public static void main(String[] args) {
		String s1 = new String("990925");
		String s2 = new String("-1055123");

		System.out.println(s1.substring(0, 6) + " " + s2.substring(1, 8));

		// 990925-1055123 -> 990925 1055123

		String s3 = new String("990925-1055123");
		System.out.println(s3.replace("-", " "));
	}

}
