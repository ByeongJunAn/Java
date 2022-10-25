package Day17;

import java.util.Random;
import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		int arr[] = new int[10];
		Scanner in = new Scanner(System.in);
		Random r = new Random();

		System.out.print("첫번째 아무 정수를 입력하세요");
		int a = in.nextInt();
		System.out.print("두번째 아무 정수를 입력하세요2");
		int b = in.nextInt();

		for (int i = 0; i < 10; i++) {
			arr[i] = (int) r.nextInt(arr[i]);
			System.out.println(arr[i]);
//				= System.out.print((int)r.nextInt(i));

//					System.out.println(i2);
//					c = i2;

//					System.out.println(i2);
//					for(int i3=; )
//	
//		System.out.println(r.nextInt(i));
		}

	}
}
