/**
 * 
 */
package inout;

/**
 * @author damienmcgloin
 *
 */
public class ConditionalOperatorExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int score;
		score = 30;
		
		System.out.println((score>=50) ? "Passed" : "Failed" );
		
		int a,b,max;
		a = 2;
		b = 9;
		
		max = (a>b) ? a : b;
		System.out.println(max);

	}

}
