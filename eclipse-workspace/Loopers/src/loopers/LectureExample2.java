/**
 * 
 */
package loopers;

/**
 * @author damienmcgloin
 *
 */
public class LectureExample2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int counter; // control var
		counter = 1; // initial value

		while (counter < 11) { // loop termination condition
			// loop body - in here is condition is TRUE
			System.out.println("Value of counter " + counter);
			counter++;
			// counter=counter+1;
		} // end of while

		System.out.println("Done");
		
		int myCounter;
		myCounter = 11;
		
		while (myCounter > 1) {
			System.out.println("Value of counter " + --myCounter);
		}
		
		System.out.println("Done");

	}

}
