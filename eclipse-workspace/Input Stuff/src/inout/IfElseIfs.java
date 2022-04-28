/**
 * 
 */
package inout;

/**
 * @author damienmcgloin
 *
 */
public class IfElseIfs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int score;
		char grade;
		
		score = 105;
		grade = 'f';
		
		if (score>=101) {
			grade = 'X';
		} else if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else {
			grade = 'F';
		}
		System.out.println("Grade is "+grade);

	}

}
