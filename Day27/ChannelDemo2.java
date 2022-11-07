package Day27;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ChannelDemo2 {

	public static void main(String[] args) throws IOException {

		Path p = Paths.get("C:\\Temp\\data.txt"); // path설정

		FileChannel fc = FileChannel.open(p, StandardOpenOption.READ, StandardOpenOption.CREATE, // FileChannel.open :
																									// 채널 열기, (읽기 쓰기
																									// 만들기가 가능한)
				StandardOpenOption.WRITE);

		ByteBuffer buf = ByteBuffer.allocate(1024);

		String s = "유유상종/\n Birds of a feather flock together.\n" + "시간은 금이다. \n Time is money.";
		buf.put(s.getBytes()); // string에 적어둔 글을 버퍼에 저장한다.
//		System.out.println(buf.put(s.getBytes()));

		buf.flip();
//		System.out.println(buf.flip());
		int count = fc.write(buf); // 이때에 버퍼에 저장해둔 글이 쓰여지고 여기서 count(개수)는 용량을 말한다.
		System.out.println("C:\\Temp\\data.txt에 " + count + "바이트 기록");

		buf.clear();

		fc.read(buf);

		System.out.println(new String(buf.array()));

		fc.close();

	}

}
