package Day17;

public class BuildString {

	public static void main(String[] args) {
		StringBuilder stbuf = new StringBuilder("123");

		stbuf.append(45678);
		System.out.println(stbuf);// stbuf도 toSting을 오버라이딩 한걸 알 수 있음
		System.out.println(stbuf.toString());

		stbuf.delete(0, 2);
		System.out.println(stbuf);

		stbuf.replace(0, 2, "AB");
		System.out.println(stbuf);

		stbuf.reverse();
		System.out.println(stbuf);

		String sub = stbuf.substring(2, 4);
		System.out.println(sub);
		System.out.println(stbuf);// substring을 사용해도 원래 값은 변화 없다.

		stbuf.append('s');
		System.out.println(stbuf);
	}

}
