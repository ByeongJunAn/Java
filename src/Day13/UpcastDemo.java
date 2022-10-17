package Day13;

public class UpcastDemo {

	public static void main(String[] args) {

		Person p;
		Student s = new Student();

		p = s; // 자동 형변환 p = (person)s;

//	p.number = 1;
//	p.work();

		p.whoami();

	}
}