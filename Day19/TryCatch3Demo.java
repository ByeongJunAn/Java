package Day19;

public class TryCatch3Demo {

	public static void main(String[] args) {
		Reso reso = new Reso();

//		try (reso) {
//			reso.show();
//		} catch (Exception e) {
//			System.out.println("예외 처리");
//		} finally {
//			try {
//				reso.close();
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
// 위 아래는 같은 말이다
		try (reso) {
			reso.show();
		} catch (Exception e) {
			System.out.println("예외 처리");
		}

	}

}
