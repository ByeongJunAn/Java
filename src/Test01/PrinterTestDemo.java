package Test01;

class Printer {
	int numOfPapers = 0;

	public void print(int amount) {
		numOfPapers = numOfPapers - amount;
	}
}