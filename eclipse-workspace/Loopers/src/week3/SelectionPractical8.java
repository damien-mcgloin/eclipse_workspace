package week3;
/**
 * 
 */

/**
 * @author damienmcgloin
 *
 */
public class SelectionPractical8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * 5. Create a Java program (using an IF... ELSE
		 *  and then a Conditional operator) that will output 
		 *  "Distinction" if a project mark is over 69 otherwise  
		 *  "Pass". 
		 */
		
		int projectMark;
		projectMark = 79;
		
		if (projectMark>69) {
			System.out.println("Distinction");
		} else {
			System.out.println("Pass");
		}
		
		System.out.println(projectMark>69 ? "Distinction" : "Pass");

	}

}
