package Day19;

import java.text.MessageFormat;

public class MassageFormatDemo {

	public static void main(String[] args) {
		String java = "Java";
		int version = 8;

		String s = MessageFormat.format("Language : {1}\nversion : {0}", version, java);

		System.out.println(s);

		Object[] data = { java, version };

		MessageFormat f = new MessageFormat("language : {0}\nversion : {1}");

		System.out.println(f.format(data));

	}

}
