/**
 * 
 */
package ifstatements;

/**
 * @author damienmcgloin
 *
 */
public class Semester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int month;
		month = 1;

		switch (month) {
		case 1:
		case 9:
		case 10:
		case 11:
		case 12:
			System.out.println("Semester 1");
			break;
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("Semester 2");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("Summer");
			break;
		default:
			System.out.println("Unknown value entered");
		}

	}

}
