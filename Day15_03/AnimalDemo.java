package Day15_03;

public class AnimalDemo {

	public static void main(String[] args) {
		Dog d = new Dog();
		Cukoo c = new Cukoo();

		makeSound(d);
		makeSound(c);

		System.out.println();// 한줄띄기

		// 배열로 하면
		Animal[] zoo = { new Dog(), new Cukoo() };

		for (Animal a : zoo) {
			makeSound(a);
		}

	}

	private static void makeSound(Animal a) {
		a.sound();

	}

}
