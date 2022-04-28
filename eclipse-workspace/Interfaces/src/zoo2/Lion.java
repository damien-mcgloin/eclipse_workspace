/**
 * 
 */
package zoo2;

/**
 * @author damienmcgloin
 *
 */
public class Lion implements IAnimal {

	@Override
	public void eat() {
		System.out.println("Lion eats big other animals");
		
	}

	@Override
	public void move() {
		System.out.println("Lion runs fast");
	}

}
