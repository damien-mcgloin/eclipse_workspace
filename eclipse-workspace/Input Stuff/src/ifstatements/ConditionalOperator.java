package ifstatements;
/**
 * 
 */

/**
 * @author damienmcgloin
 *
 */

import java.util.Scanner;

public class ConditionalOperator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String status;
		int grade;
		System.out.println("Please input your grade 'enter a number 1-100");
		
		grade = scanner.nextInt();
		
		status = grade >= 50 || grade > 60 || grade > 70 || grade > 80 ? "pass" : "fail";
		
		System.out.println("Status is "+status);
		
		scanner.close();

	}

}
