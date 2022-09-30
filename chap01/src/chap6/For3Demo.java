package chap6;

public class For3Demo {

	public static void main(String[] args) {
		int i, j;
		for (i = 0, j = 10; i < j; i++, j--)
			;
		{
			System.out.print("i=>" + i + ",");
			System.out.println("j=>" + j);

		}
		System.out.println("-------------------------");
		System.out.print("i=>" + i + ",");
		System.out.println("j=>" + j);

	}

}