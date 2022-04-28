/**
 * 
 */
package methods;

/**
 * @author damienmcgloin
 *
 */

import java.util.Random;
import java.util.Calendar;

public class Practical5Part1Again {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		oddOrEven(52);
		convertToLowerCase('a');
		checkMultiple(15, 43);
		//randomGenerator();
		countDown(5);
		printNumberInWord(9);
		printSum(100);
		timeOfDay();

	} // end of main method
	
	/**
	 * This is a method to check whether a number is odd or even
	 * @param num
	 */
	public static void oddOrEven(int num) {
		
		if (num%2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
		
	} // end of oddOrEven method
	
	/**
	 * This is a method to convert upper case letters to lower case
	 * @param letter
	 */
	public static void convertToLowerCase(char letter) {
		
		if (Character.isUpperCase(letter)) {
			System.out.println(Character.toLowerCase(letter));
		} else {
			System.out.println(letter);
		}
		
	} // end of convertToLowerCase
	
	/**
	 * This method will check if num 2 is a multiple of num 1
	 * @param num1
	 * @param num2
	 */
	public static void checkMultiple(int num1, int num2) {
		
		if (num2%num1 == 0) {
			System.out.println(num2+" is a multiple of "+num1);
		} else {
			System.out.println(num2+" is not a multiple of "+num1);
		}
		
	} // end of checkMultiple
	
	/**
	 * This method will generate 10 random numbers from 1 to 100
	 */
	public static void randomGenerator() {
		
		System.out.println("Generating 10 random integers in range 1..100");
		Random random = new Random();
		
		int randomNum = 0;
		
		for (int loop = 1; loop<=10; loop++) {
			randomNum = random.nextInt(100)+1;
			System.out.println("Generated : "+randomNum);
		}
		
		//System.out.println(randomNum);
		System.out.println("done");
		
	} // end of randomGenerator method
	
	/**
	 * This method will print a countdown and an equivalent number of asterisks
	 * @param num - this must be between 5 and 50 or an error message appears
	 */
	public static void countDown(int num) {
		
		if (num<5 || num>50) { // start of if
			System.out.println("Unknown value entered");
		} else {
		
		for (int outer = num; outer>=1; outer--) {
			System.out.print(outer);
			for (int inner = 0; inner<outer; inner++) {
				System.out.print('*');
			}
			System.out.println("");
			}		
			
		}
		
	} // end of countDown method
	
	/**
	 * This method returns the printed word of the number
	 * @param num - this can be 1,2 or 9. Other values return 'Other'
	 */
	public static void printNumberInWord(int num) {
		
		if (num == 1) {
			System.out.println("ONE");
		} else if (num == 2) {
			System.out.println("TWO");
		} else if (num == 9) {
			System.out.println("NINE");
		} else {
			System.out.println("OTHER");
		}
		
	} // end of printNumberInWord method
	
	/**
	 * This method will calculate the total of all integers added together
	 * starting from 1 to the upper limit. It also calculates the average
	 * @param num - This is the upper limit
	 */
	public static void printSum(int num) {
		
		int sum = 0;
		double average = 0;
		
		for (int loop = 1; loop <= num; loop++) {
			sum+=loop;
		}
		System.out.println("The sum is " + sum);
		average = (double) sum / (double) num;
		System.out.printf("Average is : %.2f\n", average);
		
	} // end of printSum method
	
	public static void timeOfDay() {
		
		Calendar cal = Calendar.getInstance();
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		
		if (hour<12) {
			System.out.println("Good morning");
		} else {
			System.out.println("I Hope the morning went well for you. Enjoy the rest of your day.");
		}
		
	} // end of timeOfDay method

} // end of class
