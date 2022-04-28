/**
 * 
 */
package week3;

/**
 * @author damienmcgloin
 *
 */
public class SelectionPractical2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String letter;
		letter = "x";
		
		switch (letter) {
		case "a":
		case "e":
		case "i":
		case "o":
		case "u":
			System.out.println("Vowel");
			break;
		case "b":
		case "c":
		case "d":
		case "f":
		case "g":
		case "h":
		case "j":
		case "k":
		case "l":
		case "m":
		case "n":
		case "p":
		case "q":
		case "r":
		case "s":
		case "t":
		case "v":
		case "w":
		case "x":
		case "y":
		case "z":
			System.out.println("Consonant");
			break;
		default: System.out.println("Error: Unknown value");
		}

	}

}
