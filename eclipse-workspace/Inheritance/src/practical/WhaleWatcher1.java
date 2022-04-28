/**
 * 
 */
package practical;

/**
 * @author damienmcgloin
 *
 */
public class WhaleWatcher1 {

	/**
	 * 
	 */
	public WhaleWatcher1() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Whale1 w1 = new Whale1("Right", "Atlantic", 2001, 21, 16);
		Whale1 w2 = new Whale1("Blue", "Pacific", 2001, 23, 16);
		Whale1 w3 = new Whale1("Sperm", "Atlantic", 1900, 20, 40);
		Whale1 w4 = new Whale1("Humpback", "Antarctic", 919, 13, 13);

		Whale1[] whales = { w1, w2, w3, w4 };

		displayAll(whales);
		atlanticWhales(whales);
		fastestWhale(whales);
		averageWhaleLength(whales);
		heaviestWhale(whales);

	}

	public static void displayAll(Whale1[] whales) {

		for (Whale1 whale : whales) {
			System.out.println(whale.toString());
		}

	}

	public static void atlanticWhales(Whale1[] whales) {

		System.out.println("The whales that swim in the atlantic");

		for (int loop = 0; loop < whales.length; loop++) {
			if (whales[loop].getMainOcean().equalsIgnoreCase("Atlantic")) {
				System.out.println(whales[loop].getName());
			}
		}

	}

	public static void fastestWhale(Whale1[] whales) {

		int max = whales[0].getMaxSpeed();

		System.out.println("The fastest whale(s) : ");

		for (int loop = 0; loop < whales.length; loop++) {
			if (whales[loop].getMaxSpeed() > max) {
				max = whales[loop].getMaxSpeed();
			}
		}

		for (int loop = 0; loop < whales.length; loop++) {
			if (whales[loop].getMaxSpeed() == max) {
				System.out.println(whales[loop].getName());
			}
		}

	}

	public static void averageWhaleLength(Whale1[] whales) {

		int total = 0;

		for (int loop = 0; loop < whales.length; loop++) {
			total += whales[loop].getLength();
		}

		System.out.println("The average length is " + total / whales.length);

	}

	public static void heaviestWhale(Whale1[] whales) {

		int max = whales[0].getWeight();

		System.out.println("The heaviest whale(s) : ");

		for (int loop = 0; loop < whales.length; loop++) {
			if (whales[loop].getWeight() > max) {
				max = whales[loop].getWeight();
			}
		}

		for (int loop = 0; loop < whales.length; loop++) {
			if (whales[loop].getWeight() == max) {
				System.out.println(whales[loop].getName());
			}
		}

	}

}
