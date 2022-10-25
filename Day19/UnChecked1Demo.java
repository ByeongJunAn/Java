package Day19;

import java.util.StringTokenizer;

public class UnChecked1Demo {

	public static void main(String[] args) {
		String s = "Time is money";
		StringTokenizer st = new StringTokenizer(s);
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken() + "+");

		}

//		System.out.println(st.nextToken()); // 언체크드 인셉션 (비검사형 예외)
	}

}
