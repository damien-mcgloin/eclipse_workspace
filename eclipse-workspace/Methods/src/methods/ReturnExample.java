/**
 * 
 */
package methods;

/**
 * @author damienmcgloin
 *
 */

public class ReturnExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int bigNum;
		
		bigNum = biggestNumber(3,4);
		System.out.println(bigNum);
		
		System.out.println(biggestNumber(8, 2));
		
		System.out.println(addNumbers(5, 97));
		
	} // end of main
	/**
	 * This will calculate the biggest number passed to us
	 * @param num1
	 * @param num2
	 * @return
	 */
	public static int biggestNumber(int num1, int num2) {
		
		int biggestNum = num1;
		
		if (num1>num2) {
			biggestNum=num1;
		} else {
			biggestNum=num2;
		}
		return biggestNum;
		
	} // end of biggest
	
	public static int addNumbers(int num1, int num2) {
		
		int total = num1 + num2;
		
		return total;
		
	} // end of addNumbers

} // end of class
