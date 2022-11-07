package Day27;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ChannelDemo1 {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("C:\\Temp\\org.txt");
		Path path = Paths.get("C:\\Temp\\dup.txt"); // path 설정

		FileChannel org = fis.getChannel(); // 채널 생성

		FileChannel dup = FileChannel.open(path, StandardOpenOption.WRITE, StandardOpenOption.CREATE);

		ByteBuffer buf = ByteBuffer.allocate(10);// 10개 버퍼 생성

		while (org.read(buf) != -1) { // 한개씩 읽어가며 -1이 아니면
			System.out.println(buf.flip());
			buf.flip();
			dup.write(buf);
			buf.clear();
		}
		org.close();
		dup.close();

	}

}
