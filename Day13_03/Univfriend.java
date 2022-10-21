package Day13_03;

public class Univfriend {
	private String name;
	private String major;
	private String phone;

	public Univfriend(String name, String major, String phone) {
		this.name = name;
		this.major = major;
		this.phone = phone;

	}

	public void showInfo() {
		System.out.println("이름 : " + name);
		System.out.println("전공 : " + major);
		System.out.println("전화번호 : " + phone);

	}
}
