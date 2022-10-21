package Day12_Test;

public class Test01 {

	public static void main(String[] args) {
		countChar("afasdfa", 'a');
	}

	public static int countChar(String s, char c) {
		int count = 0;
		for (int i = 0; i < s.length(); i++)

			// 하나씩 뽑아서 비교한다.
			// char를 배열로 생각한것 ㅡ> 문자열
			if (s.charAt(i) == c) {
				count++;

			}
		System.out.println("포함된 갯수" + count);

		return count;
	}
}
