package Chap6;

public class ContinueDemo3 {

	public static void main(String[] args) {
		int num = 0;
		int count = 0;

		while ((num++) < 1000) {
			if (!((num % 5 == 0 && num % 7 == 0))) {
				continue;
			}
			count++;
			System.out.printf("5의 배수이고 7의 배수인 정수 => %4d\n", num);
		}
		System.out.println("count:" + count);
	}

}
