/**
 * 
 */
package week3;

/**
 * @author damienmcgloin
 *
 */
public class SelectionPractical4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*
		 * 5. Create a Java program (using an IF... 
		 * ELSE and then a Conditional operator) 
		 * that will output "Distinction" if a project
		 * mark is over 69 otherwise  "Pass". 
		 */
		
		int score;
		score = 70;
		
		if (score>69) {
			System.out.println("Distinction");
		} else {
			System.out.println("Pass");
		}
		
		System.out.println(score>69 ? "Distinction" : "Pass");
		System.out.println(score>69 ? "Distinction" : "Pass");
		System.out.println(score>69 ? "Distinction" : "Pass");
		System.out.println(score>69 ? "Distinction" : "Pass");
		System.out.println(score>69 ? "Distinction" : "Pass");

	}

}
