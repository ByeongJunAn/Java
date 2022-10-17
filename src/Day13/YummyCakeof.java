package Day13;

class Cake {

}

class CheeseCake extends Cake {

}

class StrawberryCheesecak extends CheeseCake {

}

public class YummyCakeof {

	public static void main(String[] args) {
		Cake cake = new StrawberryCheesecak();
//		CheeseCake cake = new StrawberryCheesecak(); 
		// 가능
//		StrawberryCheesecak cake = new StrawberryCheesecak(); 
		// 가능

		if (cake instanceof Cake) {
			System.out.println("케익 인스턴스 or ");
			System.out.println("케익을 상속하는  인스턴스 \n ");

		}
		if (cake instanceof CheeseCake) {
			System.out.println("치즈케익 인스턴스 or ");
			System.out.println("치즈케익을 상속하는  인스턴스 \n ");

		}

		if (cake instanceof StrawberryCheesecak) {
			System.out.println("딸기치즈케익 인스턴스 or ");
			System.out.println("딸기 치즈케익을케익을 상속하는  인스턴스 \n ");

		}
	}
}