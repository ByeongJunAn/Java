package Test02;

class Printer {
	private int numOfPapers = 0;

	public Printer(int n) {
		numOfPapers = n;
	}

	public void print(int amount) {

		if (numOfPapers >= amount) {

			System.out.println(amount + "장 출력하였습니다. 현재" + (numOfPapers = numOfPapers - amount) + "장 남아 있습니다.");
		}

		else if (numOfPapers <= 0) {
			System.out.println("용지가 없습니다.");
		} else if (numOfPapers < amount) {
			int x;

			x = amount - numOfPapers;

			System.out.println("모두 출력하려면 용지가" + x + "매 부족합니다." + numOfPapers + "장만 출력합니다.");
			numOfPapers = 0;

		}

	}
}
