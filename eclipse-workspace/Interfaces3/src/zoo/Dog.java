/**
 * 
 */
package zoo;

/**
 * @author damienmcgloin
 *
 */
public class Dog implements IAnimal {

	@Override
	public void eat() {
		System.out.println("Dog eats bone");
	}

	@Override
	public void travel() {
		System.out.println("Dog runs and jumps and goes for a wee walk");
	}

}
