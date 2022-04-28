/**
 * 
 */
package week3;

/**
 * @author damienmcgloin
 *
 */
public class SelectionPractical5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * 1. Write a Java program to print the day of week name using If.. else if
		 * statements (i.e. if the input is 1 it outputs Sunday, 2 is Monday etc)
		 */

		int weekDay;
		weekDay = 8;

		if (weekDay == 1) {
			System.out.println("Sunday");
		} else if (weekDay == 2) {
			System.out.println("Monday");
		} else if (weekDay == 3) {
			System.out.println("Tuesday");
		} else if (weekDay == 4) {
			System.out.println("Wednesday");
		} else if (weekDay == 5) {
			System.out.println("Thursday");
		} else if (weekDay == 6) {
			System.out.println("Friday");
		} else if (weekDay == 7) {
			System.out.println("Saturday");
		} else {
			System.out.println("Unknown value entered");
		}

		/*
		 * 2. Write a Java program to print the day of week name using a switch
		 * statement (i.e. if the input is 1 it outputs Sunday, 2 is Monday etc)
		 */

		switch (weekDay) {
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
			System.out.println("Unknown value entered");
		}

	}

}
