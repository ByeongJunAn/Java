package Day27;

import java.io.File;
import java.util.Arrays;
import java.util.stream.Stream;

public class StreamDemo1 {

	public static void main(String[] args) {
		File file = new File("C:\\Windows");
		File[] fs = file.listFiles(); // 모든 자식 파일과 폴더를 file배열로 변환

		Stream<File> stream = Arrays.stream(fs); // file타입의 배열을 스트림으로 변환
		long count = stream.filter(x -> x.isDirectory() == false).count(); // x -> x.isDirectory() == false :파일 개수만 셀거야
		Stream<File> stream2 = Arrays.stream(fs);
		long count2 = stream2.filter(x -> x.isDirectory() == true).count(); // 파일 제외하고 셀거야

		System.out.println("C\\Windows에 있는 파일 개수 : " + count);
		System.out.println("C\\Windows에 있는 디렉토리 개수 : " + count2);

	}

}
