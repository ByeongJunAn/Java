package sec01;

public class EscapeSeqences {

	public static void main(String[] args) {
		System.out.println("AB" + '\b' + 'c');
		System.out.println("AB" + '\t' + 'c');
		System.out.println("AB" + '\n' + 'c');
		System.out.println("AB" + '\r' + 'c');

		System.out.println("\'AB" + 'C' + '\'');
		System.out.println("\"AB" + 'C' + '\"');
		System.out.println("\\AB" + 'C' + '\\');

	}

}
