/**
 * 
 */
package ifstatements;

/**
 * @author damienmcgloin
 *
 */
public class ExtraPractical3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		char letter;
		letter = '*';
		
		switch (letter) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.println("vowel");
				break;
			case 'b':
			case 'c':
			case 'd':
			case 'f':
			case 'g':
			case 'h':
			case 'j':
			case 'k':
			case 'l':
			case 'm':
			case 'n':
			case 'p':
			case 'q':
			case 'r':
			case 's':
			case 't':
			case 'v':
			case 'w':
			case 'x':
			case 'y':
			case 'z':
				System.out.println("consonant");
				break;
			default:
				System.out.println("invalid input");
		}
		
		
	}	
}
