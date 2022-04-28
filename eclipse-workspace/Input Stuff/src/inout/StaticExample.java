/**
 * 
 */
package inout;

/**
 * @author damienmcgloin
 *
 */
import java.util.Scanner;

public class StaticExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double side = 0;
		
		
		System.out.println("Enter the side of the square (in cms) ?");
		side = scanner.nextDouble();
		System.out.printf("Perimeter : %.2f %s", side * 4, " cm \n");
		System.out.printf("Area : %.2f %s", Math.pow(side, 2), " cm2");
		scanner.close();
	}

}
