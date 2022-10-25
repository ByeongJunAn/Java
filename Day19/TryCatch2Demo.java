package Day19;

public class TryCatch2Demo {

	public static void main(String[] args) {
		int dividend = 10;
		try {
			int divisor = Integer.parseInt(args[0]);
			System.out.println(dividend / divisor);
//		} catch (Exception e) {
//			e.printStackTrace(); //이렇게 하면 해당 메서드인Exception이 다 처리하므로 밑으로 갈 일이 없어서 오류 발생
//		}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("원소가 존재하지 않습니다");
			System.out.println(e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println("숫자가 아닙니다.");

		} catch (ArithmeticException e) {

			System.out.println("0으로 나눌 수 없습니다.");
		} finally {
			System.out.println("항상 실행됩니다.");
		}
		System.out.println("종료.");

	}

}
