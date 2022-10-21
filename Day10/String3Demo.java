package Day10;

public class String3Demo {

	public static void main(String[] args) {
		String s1 = new String("hi,");
		String s2 = new String(" java");

		System.out.println("문자열 길이(s1) : " + s1.length());
		System.out.println(s1.charAt(1)); // 문자열의 해당번호의 입력값

		s1 = s1.concat(s2);

		System.out.println(s1.concat(s2) + "!");
		System.out.println(s1.toLowerCase() + "!");
		System.out.println(s1.substring(4, 8) + "!");// "Hi, Java"의 4번지 부터 (8-1)번지 까지

		String s3 = " ";
		System.out.println(s3.isEmpty());// 공백이라는 문자열이 있으므로 false
		System.out.println(s3.isBlank()); // 길이가 0 또는 공백 일때
		String s4 = ""; // 완전 null값 이므로 아래 두 프린트에선 true
		System.out.println(s4.isEmpty());
		System.out.println(s4.isBlank());

		String s5 = "*-*";
		System.out.println(s5.repeat(10)); // s5 부터 10번 반복하라는것

		System.out.println(s2.trim().indexOf("v"));
	}

}
