package Day08;

public class BankAccount {

	int balance = 0;

	public int deposit(int amount) {
		balance += amount;
		return balance;

	}

	public int withdraw(int amount) {
		balance -= amount;
		return balance;
	}

//	public void checkMyBalance() { 
//	리턴 없이 이것만 써서 가능
	public int checkMyBalance() {
		System.out.println("잔액 : " + balance);
		return balance;
	}

}
