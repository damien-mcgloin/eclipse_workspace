package zoo;

public class Dog implements IAnimal {

	@Override
	public void eat() {
		System.out.println("Dog eats cats");
	}

	@Override
	public void move() {
		System.out.println("Dog runs fast");
		
	}

}
