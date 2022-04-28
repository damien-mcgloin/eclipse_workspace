/**
 * 
 */
package loopers;

/**
 * @author damienmcgloin
 *
 */

import java.util.Scanner;
import java.util.Random;

public class RandomGuesser {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int userInput;
		int randomNum;
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		userInput = -1;
		
		randomNum = random.nextInt(10);
		randomNum++;
		
		while (randomNum!=userInput) {
			System.out.println("Enter your guess (1-10)");
			userInput=scanner.nextInt();
		}
		System.out.println("Well done.. you got it !");
		
		scanner.close();
	}
	

}
