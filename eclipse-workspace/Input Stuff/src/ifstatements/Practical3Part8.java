package ifstatements;
/**
 * 
 */

/**
 * @author damienmcgloin
 *
 */

import java.util.Scanner;

public class Practical3Part8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int score;
		
		System.out.println("Enter mark ...");
		score = scanner.nextInt();
		
		if (score>=0 && score<=49) {
			System.out.println("Classification : Fail");
		} else if (score>=50 && score<=59) {
			System.out.println("Classification : Pass");
		} else if (score>=60 && score<=69) {
			System.out.println("Classification : Merit");
		} else if (score>=70 && score<=100) {
			System.out.println("Classification : Distinction");
		} else {
			System.out.println("Error : Unknown value");
		}
		scanner.close();

	}

}
