/**
 * 
 */
package practicals;

/**
 * @author damienmcgloin
 *
 */

import java.util.Scanner;

public class Practical3 {

	/**
	 * @param args
	 */
	
	public static void voterInput() {
		
		System.out.println("Voting...");
		System.out.println("Enter 'con' for Conservative and 'lab' for Labour");
		
		Scanner scanner = new Scanner(System.in);
		String userInput = scanner.next();
		
		if(userInput.equalsIgnoreCase("con")) {
			System.out.println("Vote registered for Conservative");
		} else if (userInput.equalsIgnoreCase("lab")) {
			System.out.println("Vote registered for Labour");
		} else {
			System.out.println("Sorry voting party unrecognized");
		}
		
		scanner.close();
		
	}
	
	public static void voterAge() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your age...");
		int userInput = scanner.nextInt();
		String userName = scanner.nextLine();
		
		if(userInput>17) {
		userName = scanner.nextLine();
		System.out.println("Name : "+userName+", Age : "+userInput);
		} else if (userInput<0) {
			System.out.println("Error : Unknown value entered");
		} else {
			System.out.println("Too young to continue... fuck off kid");
		}
		scanner.close();
		
	}
	
	public static void ifElse() {
		
		System.out.println("Enter mark...");
		
		Scanner scanner = new Scanner(System.in);
		int mark = scanner.nextInt();
		
		if(mark>=0 && mark<=49) {         
			System.out.println("Fail");
		} else if (mark>=50 && mark<=59) {
			System.out.println("Pass");
		} else if (mark>=60 && mark<=69) {
			System.out.println("Merit");
		} else if (mark>=70 && mark<=100) {
			System.out.println("Distinction");
		} else {
			System.out.println("Error : Unknown value entered");
		}
		
		scanner.close();
		
	}
	
	public static void printStatements() {
		
		System.out.println("Please enter a decimal point number in the format xx.xxxx eg 12.3456");
		
		Scanner scanner = new Scanner(System.in);
		double num = scanner.nextDouble();
		
		System.out.printf("Number rounded (two decimal places) : %.2f",num);
		System.out.printf("\nNumber rounded (two decimal places) : %.3f",Math.pow(num, 2));
		System.out.printf("\nNumber rounded (three decimal places) : %.3f",Math.pow(num, 3));
		System.out.printf("\nSquare root (four decial places) : %.4f",Math.sqrt(num));
		
		scanner.close();
		
	}
	
	public static void main(String[] args) {
		
		//printStatements();
		//ifElse();
		//voterAge();
		voterInput();

	}

}
