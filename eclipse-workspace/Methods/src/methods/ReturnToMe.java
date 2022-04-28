/**
 * 
 */
package methods;

/**
 * @author damienmcgloin
 *
 */
public class ReturnToMe {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int theBiggestNumber;
		
		System.out.println("Start");
		
		theBiggestNumber = biggest(3, 4);
		
		System.out.println(theBiggestNumber);
		
		System.out.println(biggest(4000,1));
		
		System.out.println("End");

	} // end of main method

	/**
	 * 
	 * @param num1 returns this number if it's the biggest
	 * @param num2 or this if it's the biggest
	 * @return
	 */
	public static int biggest(int num1, int num2) {

		int big;

		if (num1 > num2) {
			big = num1;
		} else {
			big = num2;
		}
		return big;

	} // end of 2nd method

}
