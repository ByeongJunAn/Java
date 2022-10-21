package Day15;

public class Person {
	String name;
	int age;

	public Person(String name) {
		this.name = name;
	}

	void show() {
		System.out.println("사람[이름 : " + name + ", 나이" + age + "]");
	}
}
