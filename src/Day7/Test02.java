package Day7;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		System.out.print("등수를 입력하세요");
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();

		switch (x) {
		case 1: {
			System.out.println("아주잘했습니다");
			break;
		}

		case 2, 3: {
			System.out.println("잘했습니다");
			break;
		}

		case 4, 5, 6: {
			System.out.println("보통입니다");
			break;
		}

		default:
			System.out.println("노력해야겠습니다");

		}

	}

}

// 키보드로 등수를 입력받아 1등이면 '아주잘했습니다.' 2~3등이면 '잘했습니다', 4~6등이면 '보통입니다.', 그 외 등수이면 '노력해야겠습니다' 라고 출력하는 프로그램을 switch 문을 사용해 작성하라.