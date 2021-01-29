package in28Minutes.interfaces;

public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal[] animalObjects = { new Cat(), new Dog() };

		for (Animal object : animalObjects) {
			object.bark();
		}
	}

}
