/**
 * 
 */
package methods;

import java.util.Random;

/**
 * @author damienmcgloin
 *
 */
public class Practical5Part2Again {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println(calculateArea(5, 25));
		String name = calculateMonth(1);
		System.out.println(name);
		System.out.println(calculateAverage(5, 85, 11300));
		System.out.println(printCity("CanADA"));
		coinToss("Heads");

	} // end of main method

	/**
	 * This method will calculate the area of a rectangle
	 * 
	 * @param height
	 * @param base
	 * @return
	 */
	public static int calculateArea(int height, int base) {

		int area = height * base;

		return area;

	} // end of calculateArea method

	/**
	 * This method prints the name of the month
	 * 
	 * @param month - input as an int from 1-12
	 * @return
	 */
	public static String calculateMonth(int month) {

		String name = "null";

		switch (month) {
		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("February");
			break;
		case 3:
			System.out.println("March");
			break;
		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("June");
			break;
		case 7:
			System.out.println("July");
			break;
		case 8:
			System.out.println("August");
			break;
		case 9:
			System.out.println("September");
			break;
		case 10:
			System.out.println("October");
			break;
		case 11:
			System.out.println("November");
			break;
		case 12:
			System.out.println("December");
			break;
		default:
			System.out.println("Unknown value");
		}

		return name;

	} // end of calculateMonth method

	/**
	 * This method returns the average of 3 int numbers as a double
	 * 
	 * @param num1
	 * @param num2
	 * @param num3
	 * @return
	 */
	public static double calculateAverage(int num1, int num2, int num3) {

		int total = num1 + num2 + num3;
		double average = 0;

		average = (double) total / 3;

		return average;

	} // end of calculateAverage method

	/**
	 * This method returns the capital city of the country entered
	 * @param country
	 * @return
	 */
	public static String printCity(String country) {

		if (country.equalsIgnoreCase("Canada")) {
			System.out.println("Ottawa");
		} else if (country.equalsIgnoreCase("France")) {
			System.out.println("Paris");
		} else if (country.equalsIgnoreCase("Germany")) {
			System.out.println("Berlin");
		} else if (country.equalsIgnoreCase("Italy")) {
			System.out.println("Rome");
		} else if (country.equalsIgnoreCase("Japan")) {
			System.out.println("Tokyo");
		} else if (country.equalsIgnoreCase("Russia")) {
			System.out.println("Moscow");
		} else if (country.equalsIgnoreCase("United Kingdom")) {
			System.out.println("London");
		} else if (country.equalsIgnoreCase("United States")) {
			System.out.println("New York");
		} else {
			System.out.println("Unknown value entered");
		}
		
		return country;
		
	} // end of printCity method
	
	/**
	 * This method simulates a coin flip
	 * @param call - user can enter heads or tails
	 */
	public static void coinToss(String call) {
		
		System.out.println("Guess... heads or tails?");
		
		Random random = new Random();
		int randomNum = random.nextInt(2);
		randomNum++;
		
		if (randomNum == 1) {
			System.out.println("Heads");
		} else if (randomNum==2) {
			System.out.println("Tails");
		}
		
	} // end of coinToss method

} // end of class
