/**
 * 
 */
package loopers;

/**
 * @author damienmcgloin
 *
 */

import java.util.Scanner;

public class PracticalPart3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	
	String name = scanner.nextLine();
	int counter = 1;
	
		for ( ; counter<11; counter++) {
			System.out.println(name);
			scanner.close();
		}
		
	}
	

}
