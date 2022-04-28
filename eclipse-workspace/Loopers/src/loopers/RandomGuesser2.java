/**
 * 
 */
package loopers;

import java.util.Random;
import java.util.Scanner;

/**
 * @author damienmcgloin
 *
 */

public class RandomGuesser2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int userNum = -1;
		int randomNum;
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		randomNum = random.nextInt(10);
		randomNum++;
		
		while (userNum!=randomNum) {
			System.out.println("Guess the number 1-10");
			userNum = scanner.nextInt();
		}
		System.out.println("Good Job!");
		scanner.close();
	}
	

}
