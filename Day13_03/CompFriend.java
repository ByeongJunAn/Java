package Day13_03;

public class CompFriend extends Friend {
	private String name;
	private String department;
	private String phone;

	public CompFriend(String name, String department, String phone) {
		this.name = name;
		this.department = department;
		this.phone = phone;

	}

	public void showInfo() {
		System.out.println("이름 : " + name);
		System.out.println("부서 : " + department);
		System.out.println("전화 : " + phone);

	}

}
