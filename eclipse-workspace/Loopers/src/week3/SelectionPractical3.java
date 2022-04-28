/**
 * 
 */
package week3;

/**
 * @author damienmcgloin
 *
 */

import java.util.Scanner;

public class SelectionPractical3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*
		 * 4. 
		 * 
Write a Java program to show the following menu, 
prompt for a user response and handle option ... 
(handling the option : just output to screen the name 
of the option chosen e.g. When the user enters 
1 the output should be output “You selected File”

1. File
2. Edit
3. Exit
Enter option …

Now update it to look like this
1. File
2. Add
3. Edit
4. Delete
5. Exit
Enter option …
 
		 */
		
		System.out.println("1. File");
		System.out.println("2. Add");
		System.out.println("3. Edit");
		System.out.println("4. Delete");
		System.out.println("5. Exit");
		System.out.println("Enter option _");
		
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
			System.out.println("Error: Unknown Value");
		}
		scanner.close();

	}

}
