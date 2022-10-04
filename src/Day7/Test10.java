package Day7;

import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("철수와 영희에게 s(가위),r(바위),p(보) 중에 하나를 입력해주세요:");

		System.out.print("철수 : ");
		String c = in.next();

		System.out.print("영희 : ");
		String y = in.next();

		if (c.equals("s") && y.equals("p") || c.equals("r") && y.equals("s") || c.equals("p") && y.equals("r")
				|| c.equals("가위") && y.equals("보") || c.equals("바위") && y.equals("가위")
				|| c.equals("보") && y.equals("바위"))
			System.out.println("철수, 승!");

		else if (c.equals("s") && y.equals("r") || c.equals("r") && y.equals("p") || c.equals("p") && y.equals("s")
				|| c.equals("가위") && y.equals("바위") || c.equals("바위") && y.equals("보")
				|| c.equals("보") && y.equals("가위"))

			System.out.println("영희, 승!");

		else {
			System.out.println("무승부입니다");
		}

	}

}

//철수와 영희가 가위(s), 바위(s), 보(p) 게임을 한다. 다음 실행 결과와 같이 r,p,s 중 하나를 입력해 승자 또는 무승부를 출력하는 프로그램을 작성하라
//철수:r 
//영희:s
//철수, 승!