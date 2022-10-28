package Day22;

import java.text.MessageFormat;

public class MessageFormatTest {

	public static void main(String[] args) {
		Object[][] data = { { "세종대왕", 1, "조선" }, { "오바마", 2, "미국" }, { "징기스칸", 3, "몽고" } };

		MessageFormat message = new MessageFormat("이름:{1}\t 번호:{0}\t 국적: {2}");

		for (int i = 0; i < data.length; i++) {

			System.out.println(message.format(data[i]));

		}

	}

}
