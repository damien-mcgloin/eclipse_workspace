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

public class Practical5Again {

	/**
	 * @param args
	 */

	public static void randomNum() {

		Random random = new Random();

		System.out.println("Generating 10 random integers in range 1..100");

		for (int loop = 1; loop <= 10; loop++) {
			int randomNumbers = random.nextInt(100);
			randomNumbers++;
			System.out.println("Generated : " + randomNumbers);
		}
		System.out.println("Done");
	}

	public static void isMultiple(int num1, int num2) {

		if (num2 % num1 == 0) {
			System.out.println("num2 is a multiple of num1");
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
			System.out.println("It's even");
		} else {
			System.out.println("It's odd");
		}

	}

	public static void numStars() {

		System.out.println("Enter a number...");

		Scanner scanner = new Scanner(System.in);
		int userInput = scanner.nextInt();

		if (userInput >= 5 && userInput <= 50) {
			for (int outer = userInput; outer >= 1; outer--) {
				System.out.print(outer + " ");
				for (int inner = 1; inner <= outer; inner++) {
					System.out.print('*');
				}
				System.out.println();
			}
		} else {
			System.out.println("Error : incorrect value entered");
		}
		scanner.close();
	}

	public static void numCounter(int num) {
		
		int total = 0;
		
		for(int loop = 0; loop<=num; loop++) {
			total+=loop;
		}
		
		double average = (double)total/num;
		
		System.out.println("The total is : "+total);
		System.out.println("The average is : "+average);
		
	}
	
	public static void timeOfDay() {
		
		Calendar calendar = Calendar.getInstance();
		
		int time = calendar.get(Calendar.HOUR_OF_DAY);
		
		if(time<12) {
			System.out.println("Good morning");
		} else {
			System.out.println("I hope the morning went well for you. Enjoy the rest of your day.");
		}
		
	}
	
	public static void averageCalculator(int num1, int num2, int num3) {
		
		double totalAverage = (double) (num1+num2+num3)/3;
		
		System.out.println(totalAverage);
		
	}
	
	public static void coinToss(String call) {
		
		Random random = new Random();
		
		int luck = random.nextInt(2);
		
		if(luck == 1) {
			System.out.println("Heads");
		} else if (luck == 0) {
			System.out.println("Tails");
		} else {
			System.out.println("Error");
		}
		
	}
	
	public static void main(String[] args) {

		// oddOrEven(11);
		// convertFromUpperToLower('L');
		// isMultiple(10, 25);
		// randomNum();
		// numStars();
		// numCounter(100);
		// timeOfDay();
		// averageCalculator(6, 15, 7);
		coinToss("Heads");

	}

}
