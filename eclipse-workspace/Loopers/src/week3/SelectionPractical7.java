/**
 * 
 */
package week3;

/**
 * @author damienmcgloin
 *
 */
import java.util.Scanner;

public class SelectionPractical7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 *  Write a Java program to show the following menu, 
		 *  prompt for a user response and handle option ... 
		 *  (handling the option : just output to screen the 
		 *  name of the option chosen e.g. When the user 
		 *  enters 1 the output should be output “You selected 
		 *  File”
1. File
2. Edit
3. Exit
Enter option …

1. File
2. Add
3. Edit
4. Delete
5. Exit
Enter option …
		 */

		System.out.printf("1.File\n2.Edit\n3.Exit\n4.Delete\n5.Exit\nEnter option _\n");
		Scanner scanner = new Scanner(System.in);
		
		int userInput;
		userInput = scanner.nextInt();
		
		switch (userInput) {
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
			System.out.println("Unknown value entered");
		}
		scanner.close();
		
	}

}
