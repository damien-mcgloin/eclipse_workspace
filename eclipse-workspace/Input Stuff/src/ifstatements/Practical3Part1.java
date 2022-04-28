package ifstatements;
/**
 * 
 */

/**
 * @author damienmcgloin
 *
 */
import java.util.Scanner;

public class Practical3Part1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		double userNum;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter a decimal point number in the format xx.xxxx eg 12.3456");
		
		userNum = scanner.nextDouble();
		
		System.out.printf("Number rounded (two decimal places) : %.2f\n",userNum);
		System.out.printf("Number squared (three decimal places) : %.3f\n",Math.pow(userNum, 2));
		System.out.printf("Number cubed to (three decimal places) : %.3f\n",Math.pow(userNum, 3));
		System.out.printf("Square root (four decimal places) : %.4f",Math.sqrt(userNum));
		
		scanner.close();
	}

}
