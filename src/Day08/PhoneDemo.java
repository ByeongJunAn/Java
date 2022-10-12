package Day08;

public class PhoneDemo {
	public static void main(String[] args) {
		Phone myPhone = new Phone();
		myPhone.model = "갤럭시 폴더4";
		myPhone.value = 140;
		myPhone.print();
		System.out.println(myPhone);

		Phone yourphone = new Phone();
		yourphone.model = "아이폰4";
		yourphone.value = 50;
		yourphone.print();
		System.out.println(yourphone);

		myPhone = yourphone;
		System.out.println(myPhone);

		myPhone.print();

	}
}
