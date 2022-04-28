/**
 * 
 */
package loopers;

/**
 * @author damienmcgloin
 *
 */
public class DoWhileLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*
		 * do {
			statement(s)
		} while (condition);
		*/
		
		int count = 1;
		do {
			System.out.println("Count is "+count);
			count++;
		} while (count<11);

	}

}
