/**
 * 
 */
package practical;

/**
 * @author damienmcgloin
 *
 */
public class WhaleWatcher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Whale w1 = new Whale("Right", "Atlantic", 2001, 21, 16);
		Whale w2 = new Whale("Blue", "Pacific", 2001, 23, 16);
		Whale w3 = new Whale("Sperm","Atlantic", 1900, 20, 40);
		Whale w4 = new Whale("Humpback","Antarctic", 919, 13, 13);

		Whale[] whales = {w1, w2, w3, w4};
		
		whaleDetails(whales);
		atlanticWhales(whales);
		fastestWhale(whales);
		averageWhaleLength(whales);
		heaviestWhale(whales);
		
	}
		
	public static void whaleDetails(Whale[] whales) {
		
		System.out.println("Here are all of the whale details...");
		for(int loop = 0; loop<whales.length; loop++) {
			System.out.println(whales[loop]);
		}
		
	}
	
	public static void atlanticWhales(Whale[] whales) {
		
		System.out.println("These whales swim mostly in the atlantic");
		for(int loop = 0; loop<whales.length; loop++) {
			if(whales[loop].getMainOcean().equalsIgnoreCase("Atlantic"))
			System.out.println(whales[loop].getName());
		}
		
	}
	
	public static void fastestWhale(Whale[] whales) {
		
		System.out.println("This whale is the fastest..");
		
		int max = whales[0].getMaxSpeed();
		
		for(int loop = 0; loop<whales.length; loop++) {
			if(whales[loop].getMaxSpeed()>max) {
				max = whales[loop].getMaxSpeed();
				System.out.println(whales[loop].getName());
			}
		}
		
	}
	
	public static void averageWhaleLength(Whale[] whales) {
		
		int total = 0;
		
		for(int loop = 0; loop<whales.length; loop++) {
			total+=whales[loop].getLength();
		}
		
		System.out.printf("The average whale length is %.2f\n", (double) total/whales.length);
		
	}
	
	public static void heaviestWhale(Whale[] whales) {
		
		System.out.println("The heaviest whales are : ");
		
		int max = whales[0].getWeight();
		
		for(int loop = 0; loop<whales.length; loop++) {
			if(whales[loop].getWeight()>max) {
				max = whales[loop].getWeight();
			}
		}
		
		for (int loop = 0; loop<whales.length; loop++) {
			if(whales[loop].getWeight() == max) {
				System.out.println(whales[loop].getName());
			}
		}
		
	}

}
