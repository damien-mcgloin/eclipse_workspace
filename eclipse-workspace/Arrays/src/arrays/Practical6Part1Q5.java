/**
 * 
 */
package arrays;

/**
 * @author damienmcgloin
 *
 */

import java.util.Scanner;

public class Practical6Part1Q5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String userName;
		char[] userNameChar;
		int totalA, totalE, totalI, totalO, totalU;
		totalA =0;
		totalE =0;
		totalI =0;
		totalO =0;
		totalU =0;
		
		Scanner scanner = new Scanner(System.in);
		
		// get user name
		System.out.println("Please enter your name");
		userName = scanner.next();
		userNameChar = new char[userName.length()];
		
		// convert to chat array
		for(int loop = 0; loop<userName.length(); loop++) {
			userNameChar[loop] = userName.charAt(loop);
		}
		
		for(int loop=0; loop<userNameChar.length; loop++) {
		
			switch (userNameChar[loop]) {
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
