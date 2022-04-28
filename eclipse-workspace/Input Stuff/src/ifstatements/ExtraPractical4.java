/**
 * 
 */
package ifstatements;

/**
 * @author damienmcgloin
 *
 */

import java.util.Scanner;

public class ExtraPractical4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("1. File");
		System.out.println("2. Add");
		System.out.println("3. Edit");
		System.out.println("4. Delete");
		System.out.println("5. Exit");
		System.out.println("Enter option _");
		
		Scanner scanner = new Scanner(System.in);
		int selection;
		selection = scanner.nextInt();
		
		switch (selection) {
			case 1:
				System.out.println("You selected File");
				break;
			case 2:
				System.out.println("You selected Add");
				break;
			case 3:
				System.out.println("You selected Edit");
				break;
			case 4:
				System.out.println("You selected Delete");
				break;
			case 5:
				System.out.println("You selected Exit");
				break;
			default:
				System.out.println("Invalid input");
				scanner.close();
		}

	}

}
