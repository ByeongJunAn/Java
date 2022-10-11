package Test06;

class Member {

	private String name;
	private String id;
	private String password;
	private int age;

	public Member(String name, String id, String password, int age) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId() {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName() {
		this.name = name;

	}

	public String getPasswd() {
		return password;
	}

	public void setPasswd() {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge() {
		this.age = age;
	}
}
