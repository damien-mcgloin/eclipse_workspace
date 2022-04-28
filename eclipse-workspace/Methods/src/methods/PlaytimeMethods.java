/**
 * 
 */
package methods;

/**
 * @author damienmcgloin
 *
 */

import java.util.Scanner;

public class PlaytimeMethods {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//invokeItalianDay(1);
		shoeAverage(2, 4, 6, 3, 12, 8, 10);
		
	} // end of main method

	/**
	 * This method will invoke the day in Italian
	 * @param day - range of 1-7
	 * @return the day of the week in Italian as a string
	 */
	public static String invokeItalianDay(int day) {
		
		System.out.println("Please enter a number 1-7");
		
		Scanner scanner = new Scanner(System.in);
		day = scanner.nextInt();
		
		String answer = "null";
		
		switch (day) {
		case 1:
			System.out.println("Today is Domenica");
			break;
		case 2:
			System.out.println("Today is Lunedi");
			break;
		case 3:
			System.out.println("Today is Martedi");
			break;
		case 4:
			System.out.println("Today is Mercoledi");
			break;
		case 5:
			System.out.println("Today is Giovedi");
			break;
		case 6:
			System.out.println("Today is Venerdi");
			break;
		case 7:
			System.out.println("Today is Sabato");
			break;
		default:
			System.out.println("Unknown value");
		}
		scanner.close();
		return answer;
		
		
	} // end of translate method
	
	public static int shoeAverage(int num1, int num2, int num3, int num4, int num5, int num6, int num7) {
		
		int total = num1+num2+num3+num4+num5+num6+num7;
		double average = (double) total/7;
		System.out.println(average);
		
		return total;
		
	}
	
}
