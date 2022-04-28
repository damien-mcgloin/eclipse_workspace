/**
 * 
 */
package oop;

/**
 * @author damienmcgloin
 *
 */
public class GreetingsManager {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Starting application");
		
		// create the messageCentre object
		MessageCentre messageCentre = new MessageCentre();
		messageCentre.displayWelcomeMessage();
		
		System.out.println("End of application");

	}

}
