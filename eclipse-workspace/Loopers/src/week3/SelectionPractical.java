/**
 * 
 */
package week3;

/**
 * @author damienmcgloin
 *
 */
public class SelectionPractical {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int dayOfWeek;
		dayOfWeek = 8;
		
		
		if (dayOfWeek==1) {
			System.out.println("Sunday");
		} else if (dayOfWeek==2) {
			System.out.println("Monday");
		} else if (dayOfWeek==3) {
			System.out.println("Tuesday");
		} else if (dayOfWeek==4) {
			System.out.println("Wednesday");
		} else if (dayOfWeek==5) {
			System.out.println("Thursday");
		} else if (dayOfWeek==6) {
			System.out.println("Friday");
		} else if (dayOfWeek==7) {
			System.out.println("Saturday");
		} else {
			System.out.println("Error: Unknown value");
			}
		
		switch (dayOfWeek) {
		case 1: 
			System.out.println("Sunday");
			break;
		case 2: 
			System.out.println("Monday");
			break;
		case 3: 
			System.out.println("Tuesday");
			break;
		case 4: 
			System.out.println("Wednesday");
			break;
		case 5: 
			System.out.println("Thursday");
			break;
		case 6: 
			System.out.println("Friday");
			break;
		case 7: 
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Error: Unknown value");
		}
		
		
	}

}
