/**
 * 
 */
package arrays;

/**
 * @author damienmcgloin
 *
 */

import java.util.Scanner;

public class Practical6Walkthrough3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		nameVowelCounter();
		

	}

	public static void nameVowelCounter() {

		String userName;
		int totalA, totalE, totalI, totalO, totalU;
		totalA = 0;
		totalE = 0;
		totalI = 0;
		totalO = 0;
		totalU = 0;

		Scanner scanner = new Scanner(System.in);

		// get user name
		System.out.println("Enter your name : ");
		userName = scanner.next();

		for (int loop = 0; loop < userName.length(); loop++) {

			// is this a vowel lowercase and uppercase

			switch (userName.charAt(loop)) {
			case 'a':
			case 'A':
				totalA++;
				break;
			case 'e':
			case 'E':
				totalE++;
				break;
			case 'i':
			case 'I':
				totalI++;
				break;
			case 'o':
			case 'O':
				totalO++;
				break;
			case 'u':
			case 'U': 
				totalU++;
				break;
			default:
				// not a vowel

			}

		}
		
		System.out.println("Total A : "+totalA);
		System.out.println("Total E : "+totalE);
		System.out.println("Total I : "+totalI);
		System.out.println("Total O : "+totalO);
		System.out.println("Total U : "+totalU);

		scanner.close();
	}

}
