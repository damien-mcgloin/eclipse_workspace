/**
 * 
 */
package week3;

/**
 * @author damienmcgloin
 *
 */
public class SelectionPractical6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * 3. Write a Java program to check whether 
		 * a letter is vowel or consonant using a switch 
		 * statement. 
		 */
		
		String letter = "w";
		
		switch (letter) {
		case "a":
		case "e":
		case "i":
		case "o":
		case "u":
			System.out.println("vowel");
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
			System.out.println("consonant");
			break;
		default:
			System.out.println("Unknown value entered");
		
		
		}

	}

}
