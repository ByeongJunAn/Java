package Day8;

public class BankAccountDemo {

	public static void main(String[] args) {

		BankAccount myba = new BankAccount();

		myba.deposit(1000);

		myba.withdraw(500);

		myba.checkMyBalance();
		System.out.println();

		BankAccount frba = new BankAccount();

		frba.deposit(5000);

		frba.withdraw(10);

		frba.checkMyBalance();
		System.out.println();

	}

}
