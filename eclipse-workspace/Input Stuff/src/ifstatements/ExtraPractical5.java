/**
 * 
 */
package ifstatements;

/**
 * @author damienmcgloin
 *
 */
public class ExtraPractical5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int score;
		score = 70;
		
		if (score>69) {
			System.out.println("Distinction");
		} else {
			System.out.println("Pass");
		}
		
		System.out.println(score>69 ? "Distinction" : "Pass");

	}

}
