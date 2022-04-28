package ifstatements;

/**
 * 
 */

/**
 * @author damienmcgloin
 *
 */


public class SwitchExample2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int month;
		month = 10;

		switch (month) {
		case 1:
		case 2:
		case 12:
			System.out.println("The season is winter");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("The season is Spring");
			break;
		case 6:	
		case 7:
		case 8:
			System.out.println("The season is Summer");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("The season is Fall");
			break;
		default:
			System.out.println("Unknown invalid month");

		} // end of switch
		
		System.out.println("Bye");

	}

}
