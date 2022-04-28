/**
 * 
 */
package mountain;

/**
 * @author damienmcgloin
 *
 */
public class MountainManager {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		MountainOne everest = new MountainOne();
		everest.setName("Everest");
		everest.setHeight(150);
		System.out.println(everest.getName());
		System.out.println(everest.getHeight());
		
		MountainOne slieveDonard = new MountainOne();
		slieveDonard.setName("The Slieve Donard");
		slieveDonard.setHeight(150);
		System.out.println(slieveDonard.getName());
		System.out.println(slieveDonard.getHeight());
		

	}

}
