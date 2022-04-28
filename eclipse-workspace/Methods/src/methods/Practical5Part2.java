/**
 * 
 */
package methods;

/**
 * @author damienmcgloin
 *
 */

import java.util.Random;

public class Practical5Part2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println(areaCalculate(5, 25));
		System.out.println(calculateMonth(12));
		System.out.println(averageNumber(5, 5, 5));
		System.out.println(cityName("Japan"));
		System.out.println(coinToss());

	} // end of main method

	/**
	 * This method will calculate the area of a rectangle
	 * 
	 * @param height - height of rectangle
	 * @param base   - base of rectangle
	 * @param area   - the total area
	 * @return
	 */
	public static int areaCalculate(int height, int base) {

		int area;
		area = height * base;
		// System.out.println(area);
		return area;

	} // end of area method

	/**
	 * This is a method to calculate the month
	 * 
	 * @param month - this number will determine the current month
	 * @return
	 */
	public static String calculateMonth(int month) {

		String name = null;

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
	 * This method will print the average of 3 int numbers as a double
	 * 
	 * @param num1
	 * @param num2
	 * @param num3
	 * @return
	 */
	public static double averageNumber(int num1, int num2, int num3) {

		int total = num1 + num2 + num3;

		double average = total / 3;

		return average;

	} // end of averageNumber method

	public static String cityName(String countryName) {
		
		if (countryName.equalsIgnoreCase("Canada")) {
			System.out.println("Ottawa");
		} else if (countryName.equalsIgnoreCase("France")) {
			System.out.println("Paris");
		} else if (countryName.equalsIgnoreCase("Germany")) {
			System.out.println("Paris");
		} else if (countryName.equalsIgnoreCase("Italy")) {
				System.out.println("Paris");
		} else if (countryName.equalsIgnoreCase("Japan")) {
			System.out.println("Tokyo");
		} else if (countryName.equalsIgnoreCase("Russia")) {
			System.out.println("Moscow");
		} else if (countryName.equalsIgnoreCase("United Kingdom")) {
			System.out.println("London");
		} else if (countryName.equalsIgnoreCase("United States")) {
			System.out.println("Washington");
		} else {
			System.out.println("Me no know!");
		}
		
		return countryName;
		
	} // end of cityName method
	
	public static int coinToss() {
		
		int randomNum;
		
		Random random = new Random();
		
		randomNum = random.nextInt(2);
		randomNum++;
		
		if (randomNum == 1) {
			System.out.println("Heads");
		} else if (randomNum == 2) {
			System.out.println("Tails");
		} else {
			System.out.println("Unknown");
		}
		
		return randomNum;
		
	} // end of coinToss method

}
