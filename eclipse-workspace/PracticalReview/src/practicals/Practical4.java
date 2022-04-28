/**
 * 
 */
package practicals;

/**
 * @author damienmcgloin
 *
 */

import java.util.Random;
import java.util.Scanner;
import java.util.Calendar;

public class Practical4 {

	/**
	 * @param args
	 */

	public static void coinToss(String call) {
		
		Random random = new Random();
		
		int num = random.nextInt(2);
		
		if(num==1) {
			System.out.println("Heads");
		} else if (num==0) {
			System.out.println("Tails");
		} else {
			System.out.println("Error");
		}
		
	}
	
	public static void capitalCityFinder(String country) {
		
		if(country.equalsIgnoreCase("Canada")) {
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
			System.out.println("Washington");
		} else {
			System.out.println("Unknown entry");
		}
		
	}
	
	public static void averageCalculator(int num1, int num2, int num3) {
		
		double average = (double) (num1 + num2 + num3)/3;
		System.out.println(average);
		
	}
	
	public static void monthCalculator(int month) {

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
			System.out.println("there are twelve months in a year... dum dum");
		}

	}

	public static void areaCalculation(int num1, int num2) {

		int area = num1 * num2;
		System.out.println("The area of the rectangle is : " + area);

	}

	public static void timeOfDay() {

		Calendar calendar = Calendar.getInstance();

		int time = calendar.get(Calendar.HOUR_OF_DAY);

		if (time < 12) {
			System.out.println("Good morning");
		} else {
			System.out.println("I hope the morning went well for you. Enjoy the rest of your day.");
		}

	}

	public static void printNumSum(int num) {

		int total = 0;

		for (int loop = 0; loop <= num; loop++) {
			total += loop;
		}
		System.out.println("The total is : " + total);

		double average = (double) total / num;
		System.out.println("The average is : " + average);
	}

	public static void printNumberInWord() {

		System.out.println("Please enter a number...");

		Scanner scanner = new Scanner(System.in);

		int userInput = scanner.nextInt();

		switch (userInput) {
		case 1:
			System.out.println("ONE");
			break;
		case 2:
			System.out.println("TWO");
			break;
		case 9:
			System.out.println("Nine");
			break;
		default:
			System.out.println("Sorry, I didn't bother coding the other numbers");
		}

		scanner.close();

	}

	public static void numStars() {

		System.out.println("Please enter a number 1-50");

		Scanner scanner = new Scanner(System.in);

		int userInput = scanner.nextInt();

		if (userInput >= 5 && userInput <= 50) {
			for (int outer = userInput; outer >= 1; outer--) {
				System.out.print("\n" + outer + " ");
				for (int inner = 1; inner <= outer; inner++) {
					System.out.print('*');
				}
			}
		} else {
			System.out.println("error : number must be between 1-50");
		}

		scanner.close();
	}

	public static void randomNum() {

		Random random = new Random();

		System.out.println("Generating 10 random integers in range 1..100");

		for (int loop = 0; loop <= 10; loop++) {
			int num1 = random.nextInt(100);
			num1++;
			System.out.println("Generated : " + num1);
		}
		System.out.println("Done");
	}

	public static void isMultiple(int num1, int num2) {

		if (num2 % num1 == 0) {
			System.out.println("num2 is a multiple of num 1");
		} else {
			System.out.println("num2 is not a multiple of num1");
		}

	}

	public static void convertFromUpperToLower(char letter) {

		if (Character.isUpperCase(letter)) {
			System.out.println(Character.toLowerCase(letter));
		} else {
			System.out.println(letter);
		}
	}

	public static void oddOrEven(int num) {

		if (num % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}

	}

	public static void main(String[] args) {

		// convertFromUpperToLower('A');
		// oddOrEven(58);
		// isMultiple(150, 15);
		// randomNum();
		// numStars();
		// printNumberInWord();
		// printNumSum(100);
		// timeOfDay();
		// areaCalculation(10, 14);
		// monthCalculator(1);
		// averageCalculator(10, 13, 39);
		coinToss("heads");

	}

}
