package Day6;

public class ContinueDemo2 {

	public static void main(String[] args) {
		int i;
		int count = 0;

		for (i = 0; i < 1000; i++) {
			if (!(i % 5 == 0 && i % 7 == 0)) {
				continue;
			}
			count++;
			System.out.printf("5의 배수이고 7의 배수인 정수 => %4d\n", i);
		}
		System.out.println("count:" + count);
	}

}
