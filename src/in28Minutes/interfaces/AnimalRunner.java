package in28Minutes.interfaces;

public class AnimalRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flyable [] flyingObjects = {new Bird(),new Aeroplan()};
		
		for (Flyable object: flyingObjects) {
			object.fly();
		}
	}

}
