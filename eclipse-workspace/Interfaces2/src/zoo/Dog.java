package zoo;

public class Dog implements IAnimal {

	@Override
	public void eat() {
		System.out.println("Dogs eat doggy snacks");	
	}
	
	public void move() {
		System.out.println("Dogs are pretty fast");
	}

}
