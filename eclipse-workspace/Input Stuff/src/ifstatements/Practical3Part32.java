package ifstatements;
/**
 * 
 */

/**
 * @author damienmcgloin
 *
 */
import java.util.Scanner;

public class Practical3Part32 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String userParty;
		String conserv;
		String labour;
		
		conserv = "con";
		labour = "lab";
		
		System.out.printf("Voting...\nEnter 'con' for Conservative and 'lab' for Labour\n");
		userParty = scanner.nextLine();
		
		if (userParty.equalsIgnoreCase(conserv)) {
			System.out.println("Vote registered for Conservation");
		} else if (userParty.equalsIgnoreCase(labour)) {
			System.out.println("Vote registered for Labour");
		} else {
			System.out.println("Sorry don't recognize your input");
		}
		scanner.close();

	}

}
