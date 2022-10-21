package Day15_02;

public class PrinterDriver {

	public static void main(String[] args) {
		String myDoc = "This is a report about...";

		// 삼성 프린터 출력

		Printable prn = new SPrinterDriver();
		prn.print(myDoc);
		System.out.println();// 한줄 띄기

		// 엘지 프린터 출력
		prn = new LPrinterDriver();
		prn.print(myDoc);

	}

}
