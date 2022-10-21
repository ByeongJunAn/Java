package Day17;

import java.util.StringTokenizer;

public class StringTokenizerDemo {
	public static void main(String[] args) {
		String s = "of the people, by the people, for the people";

		tokenizer(s, ", ");
		s = "PM:08:45";
		tokenizer(s, ":");
		s = "12+ 36 - 5 / 2 =44";
		tokenizer(s, "+-/= ");
	}

	public static void tokenizer(String s, String d) {
		StringTokenizer st = new StringTokenizer(s, d);

		System.out.println(st.countTokens());

		while (st.hasMoreTokens()) {
			System.out.println("[" + st.nextToken() + "]");

		}

	}

}
