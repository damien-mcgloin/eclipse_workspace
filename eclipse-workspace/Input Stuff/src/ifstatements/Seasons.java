package ifstatements;
/**
 * 
 */

/**
 * @author damienmcgloin
 *
 */
public class Seasons {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int month;
		String season;
		month =2;

		switch (month) {
		case 1:
		case 2:
		case 12:
			season = "Winter";
			//break;
		case 3:
		case 4:
		case 5:
			season = "Spring";
			break;
		default:
			season = "Unknown";

		} // end of switch

		System.out.println("Season is " + season);

	}

}
