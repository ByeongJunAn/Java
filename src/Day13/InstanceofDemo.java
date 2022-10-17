package Day13;

public class InstanceofDemo {

	public static void main(String[] args) {
		Student s = new Student();
		Person p = new Person();
		Person p2 = new Student();
//		Student s2 = (Student) new Person(); 부모타입인데 자식타입에 넣어서

		System.out.println(s instanceof Person);

		System.out.println(s instanceof Student);

		System.out.println(p instanceof Student);

//		System.out.println(s instanceof String);
		System.out.println(s instanceof Object);

		downcast(s);

	}

	static void downcast(Person p) {
		if (p instanceof Student) {
			Student s = (Student) p;
			System.out.println("ok, 하향 타입 변환");
		}
	}

}
