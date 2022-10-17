package Test03;

class PrinterTestrDemo03 {
	private int numOfPapers;
	private boolean duplex;

	public PrinterTestrDemo03(int numOfPapers, boolean duplex) {
		this.numOfPapers = numOfPapers;
		this.duplex = duplex;
	}

	public void print(int amount) {
		if (numOfPapers <= 0) {
			System.out.println("출력할 용지가 부족합니다.");
		}

		else {
			if (duplex == true) {
				int d = (int) Math.ceil((double) amount / 2);

				if (numOfPapers > d) {
					System.out.println("양면으로" + d + "장 출력했습니다. 현재" + (numOfPapers -= d) + "장 남아 있습니다.");
				} else {
					System.out.println("양면으로 출력할 용지가 부족합니다.");

				}

			}

			else {
				if (numOfPapers >= amount) {

					System.out.println("단면으로 모두 출력하려면 용지가" + amount + "매 부족합니다" + (numOfPapers = numOfPapers - amount)
							+ "장만 출력합니다.");
				}

				else if (numOfPapers <= 0) {
					System.out.println("용지가 없습니다.");
				} else if (numOfPapers < amount) {
					int x;

					x = amount - numOfPapers;

					System.out.println("단면으로 모두 출력하려면 용지가" + x + "매 부족합니다." + numOfPapers + "장만 출력합니다.");
					numOfPapers = 0;
				}
			}
		}
	}

	public boolean getDuplex() {
		return duplex;
	}

	public void setDuplex(boolean duplex) {
		this.duplex = duplex;
	}

}
