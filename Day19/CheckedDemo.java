package Day19;

public class CheckedDemo {

	public static void main(String[] args) {
		try { // 예외 발생하는 코드
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// 예외 발생시 처리하는 코드
			e.printStackTrace();

		}

//		finally {
//			//예외가 발생하던 안하던 반드시 처리 해야할때 (주로 자원을 닫아줘야 할때)
//		}
//		
//		catch (Exception e) {
//			//예외 클래스 여러개 생성 가능
//		}

	}

}
