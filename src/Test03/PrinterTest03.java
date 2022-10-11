package Test03;

public class PrinterTest03 {

	public static void main(String[] args) {
		PrinterTestrDemo03 p = new PrinterTestrDemo03(20, true);
		p.print(25);
		p.setDuplex(false);
		p.print(10);

	}

}
