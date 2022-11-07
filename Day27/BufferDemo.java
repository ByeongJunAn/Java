package Day27;

import java.nio.ByteBuffer;

public class BufferDemo {

	public static void main(String[] args) {

		ByteBuffer buf = ByteBuffer.allocate(10);// 새로 버퍼 생성

		System.out.println(buf);

		buf.put("ab".getBytes()); // 버퍼에 내용 추가
		System.out.println(buf);

		buf.put("cde".getBytes()); // 바이트에 내용 넣어줌
		System.out.println(buf);

		buf.flip();
		System.out.println(buf); // limit <- position

		System.out.println(new String(buf.array()));

		buf.clear(); // 처음 생성했을 때 처럼
		System.out.println(buf);

	}

}
