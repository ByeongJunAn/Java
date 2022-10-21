package Day17;

public class SysytemDemo {

	public static void main(String[] args) {
		int[] src = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
		int[] dst = { 100, 200, 300, 400, 500, 600, 700 };
		System.arraycopy(src, 2, dst, 3, 2); // src는 3부터 끝까지, dst는 300부터 4개까지

		for (int i = 0; i < dst.length; i++) {
			System.out.println(dst[i] + " ");

		}

		System.out.println();

		System.out.println(System.currentTimeMillis());
		System.out.println(System.getenv("JAVA_HOME")); // 환경변수 값 가져와
		System.out.println(System.getProperty("os.name")); // os 가져와
		System.out.println(System.nanoTime());

	}

}
//3456