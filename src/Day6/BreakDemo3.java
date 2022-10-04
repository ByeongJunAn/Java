package Day6;

public class BreakDemo3 {

	public static void main(String[] args) {
		int num = 1;
		int search = 0;

		while (num < 10000) {
			if (((num % 5) == 0) && ((num % 7) == 0)) {
				search++;
				System.out.printf("5의 배수이고 7의 배수인 정수 %d => %4d\n", search, num);
				if (search > 4) {

					break;
				}

			}
			num++;

		}

		System.out.println("while문의 반복 횟수: " + num);
	}
}
