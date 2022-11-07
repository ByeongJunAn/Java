package Day27;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class FilesDemo2 {

	public static void main(String[] args) throws Exception {
		Charset cs = Charset.defaultCharset();
		Path p = new File("C:\\Temp\\new.txt").toPath();

		if (Files.notExists(p))
			Files.createFile(p); // 없다면 새로 만들어줘

		byte[] data = "좋은 아침!\n잘 가세요!\n".getBytes();// getBytes() : 용량 체크
		Files.write(p, data, StandardOpenOption.APPEND); // APPEND: 뒤에 붙이기

		try {
			List<String> lines = Files.readAllLines(p, cs);// readAllLines: 전체 읽기, 리턴타입: List

			for (String line : lines)
				System.out.println(line);

		} catch (IOException e) {
		}
	}
}
