/**
 * 
 */
package loopers;

/**
 * @author damienmcgloin
 *
 */

import java.util.Scanner;

public class Practical4Part1AgainAgain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*int sum, num;
		sum = 0;
		num = 1;
		
		while (num<11) {
		sum+=num++;
		System.out.println("The sum is "+sum);
		}*/
		
		Scanner scanner = new Scanner(System.in);
		int userInput;

		do {
			// output menu to screen
			System.out.println("1. File");
			System.out.println("2. Edit");
			System.out.println("3. Save");
			System.out.println("4. Delete");
			System.out.println("5. Exit");

			// prompt user for response
			System.out.println("Enter your choice e.g 1,2,3\n");
			userInput = scanner.nextInt();

			// set conditions
			switch (userInput) {
			case 1:
				System.out.println("File selected\n");
				break;
			case 2:
				System.out.println("Edit selected\n");
				break;
			case 3:
				System.out.println("Save selected\n");
				break;
			case 4:
				System.out.println("Delete selected\n");
				break;
			case 5:
				System.out.println("Exit selected\n");
				break;
			default:
				System.out.println("Unknown value entered");
			}
		} while (userInput != 5);

		System.out.println("Have a great day!");
		scanner.close();
	}
		
		
	}


