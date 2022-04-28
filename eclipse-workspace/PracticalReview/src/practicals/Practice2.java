/**
 * 
 */
package practicals;

import java.util.Random;
import java.util.Calendar;
import java.util.Scanner;

/**
 * @author damienmcgloin
 *
 */
public class Practice2 {

	public static void anotherNestedLoop() {
		
		for(int outer = 1; outer<=3; outer++) {
			for(int inner = 1; inner<=10; inner++) {
				if(outer == 1) {
				System.out.print("*"+inner);
				} else if (outer ==2) {
					System.out.print("**"+inner);
				} else {
					System.out.print("***"+inner);
				}
				
				if(inner!=10) {
					System.out.print(",");
				}
	
			}
			System.out.println();
		}
		
	}
	
	public static void magicBall() {

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		System.out.println("Ask a question and learn your future...");
		
		String userInput = scanner.nextLine();
		int answer = random.nextInt(8);
		answer+=1;

		System.out.println(userInput);

		switch (answer) {
		case 1:
			System.out.println("As I see it, yes.");
			break;
		case 2:
			System.out.println("Ask again later.");
			break;
		case 3:
			System.out.println("Better not tell you now.");
			break;
		case 4:
			System.out.println("Cannot predict now.");
			break;
		case 5:
			System.out.println("Concentrate and ask again.");
			break;
		case 6:
			System.out.println("Don't count on it.");
			break;
		case 7:
			System.out.println("It is certain.");
			break;
		case 8:
			System.out.println("It is decidedly so.");
			break;
		default:
		}

		scanner.close();

	}

	/**
	 * 
	 */
	public static void ageChecker() {

		Scanner scanner = new Scanner(System.in);

		int userInput;

		do {

			System.out.println("Please enter your age...");

			userInput = scanner.nextInt();

		} while (userInput < 1 || userInput > 120);

		if (userInput >= 1 && userInput <= 30) {
			System.out.println("You are young");
		} else if (userInput >= 31 && userInput <= 60) {
			System.out.println("You are getting on!");
		} else if (userInput >= 61 && userInput <= 120) {
			System.out.println("You look amazing for your age!");
		} else {
			System.out.println("error : invalid entry");
		}

		scanner.close();

	}

	/**
	 * 
	 */
	public static void leapYears() {

		for (int year = 1910; year <= 1990; year++) {
			if (year % 4 == 0) {
				System.out.println(year);
			}
		}

	}

	/**
	 * 
	 */
	public static void nestedLoop() {

		for (int outer = 1; outer <= 3; outer++) {
			for (int inner = 1; inner <= 10; inner++) {
				if (outer == 1) {
					System.out.print("* " + inner);
				} else if (outer == 2) {
					System.out.print("** " + inner);
				} else {
					System.out.print("*** " + inner);
				}

				if (inner != 10) {
					System.out.print(", ");
				}

			}
			System.out.println();
		}

	}

	/**
	 * 
	 */
	public static void launchAborted() {

		for (int loop = 1000; loop >= 0; loop--) {
			if (loop == 333) {
				System.out.println("skip");
				continue;
			} else {
				System.out.println(loop);
			}
		}
		System.out.println("launch aborted!");
	}

	/**
	 * 
	 */
	public static void oddNums() {

		for (int loop = 10; loop <= 40; loop++) {
			if (loop % 2 == 1) {
				System.out.println(loop);
			}
		}

	}

	/**
	 * 
	 */
	public static void evenNums() {

		for (int loop = 1; loop <= 100; loop++) {
			if (loop % 2 == 0) {
				System.out.println(loop);
			}
		}

	}

	/**
	 * 
	 */
	public static void liftOff() {

		int loop = 11;
		while (loop > 1) {
			loop--;
			System.out.print(loop + ", ");
		}
		System.out.print("Liftoff!");

	}

	/**
	 * 
	 */
	public static void numOutput() {

		for (int loop = 1; loop <= 10; loop++) {
			if (loop < 10) {
				System.out.print(loop + ",");
			} else {
				System.out.println(loop);
			}
		}

	}

	public static void userString() {

		System.out.println("Enter your name");

		Scanner scanner = new Scanner(System.in);

		String name = scanner.nextLine();

		for (int loop = 0; loop < 10; loop++) {
			System.out.println(name);
		}

		scanner.close();

	}

	/**
	 * 
	 */
	public static void menu() {

		Scanner scanner = new Scanner(System.in);
		int userInput;

		do {

			System.out.println("1. File");
			System.out.println("2. Edit");
			System.out.println("3. Save");
			System.out.println("4. Delete");
			System.out.println("5. Exit");

			System.out.println("Select option ....");

			userInput = scanner.nextInt();

			switch (userInput) {
			case 1:
				System.out.println("\nFile selected.\n");
				break;
			case 2:
				System.out.println("\nEdit selected\n");
				break;
			case 3:
				System.out.println("\nSave selected\n");
				break;
			case 4:
				System.out.println("\nDelete selected\n");
				break;
			case 5:
				System.out.println("\nExit selected\n");
				break;
			default:
				System.out.println("\nUnknown value entered. Try again or select 5 to exit\n");
			}

		} while (userInput != 5);

		scanner.close();

	}

	/**
	 * 
	 */
	public static void repetition() {

		int num = 1;
		int sum = 0;

		while (num < 11) {
			sum += num;
			num++;
		}
		System.out.println("The sum is: " + sum);

	}

	/**
	 * 
	 * @param call
	 */
	public static void coinToss(String call) {

		Random random = new Random();

		int luck = random.nextInt(2);

		if (luck > 0) {
			System.out.println("Heads");
		} else {
			System.out.println("Tails");
		}

	}

	/**
	 * 
	 */
	public static void timeOfDay() {

		Calendar cal = Calendar.getInstance();

		int time = cal.get(Calendar.HOUR_OF_DAY);

		if (time > 11) {
			System.out.println("Good morning");
		} else {
			System.out.println("I hope you had a lovely morning.");
		}

	}

	/**
	 * 
	 * @param num
	 */
	public static void sumPlusAverage(int num) {

		double counter = 1;

		for (int loop = num - 1; loop > 0; loop--) {
			counter++;
			num += loop;
		}

		System.out.println("The total is : " + num + " and the average is " + (num / counter));
	}

	/**
	 * 
	 * @param num
	 */
	public static void numStars(int num) {

		if (num >= 5 && num <= 50) {
			for (int outer = num; outer >= 1; outer--) {
				System.out.println();
				System.out.print(outer + " ");
				for (int inner = 1; inner <= outer; inner++) {
					System.out.print("*");
				}
			}
		} else {
			System.out.println("Incorrect value : enter a number between 5 and 50");
		}
	}

	/**
	 * 
	 */
	public static void randomNumGen() {

		Random random = new Random();

		for (int loop = 1; loop <= 10; loop++) {
			int userInput = random.nextInt(100);
			userInput++;
			System.out.println("Generated : " + userInput);
		}
	}

	/**
	 * 
	 * @param num1
	 * @param num2
	 */
	public static void isMultiple(int num1, int num2) {

		if (num2 % num1 == 0) {
			System.out.println("Num2 is a multiple of num1");
		} else {
			System.out.println("Num2 is not a multiple of num1");
		}

	}

	/**
	 * 
	 * @param letter
	 */
	public static void convertFromUpperToLower(char letter) {

		if (Character.isUpperCase(letter)) {
			System.out.println(Character.toLowerCase(letter));
		} else {
			System.out.println(letter + " : This letter is already lower case.");
		}

	}

	/**
	 * 
	 * @param num
	 */
	public static void oddOrEven(int num) {

		if (num % 2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}

	}

	public static void timeOfYear() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the current month e.g 1, 2, etc.");

		int userInput = scanner.nextInt();

		switch (userInput) {
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
		case 13:
			System.out.println("Thank you, have a nice day!");
			break;
		default:
			System.out.println("Incorrect value : enter a number from 1-12 for the current month or 13 to quit");
		}

		scanner.close();

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// oddOrEven(6);
		// convertFromUpperToLower('H');
		// isMultiple(10, 209);
		// randomNumGen();
		// numStars(51);
		// sumPlusAverage(100);
		// timeOfDay();
		// timeOfYear();
		// coinToss("heads");
		// repetition();
		// menu();
		// userString();
		// numOutput();
		// liftOff();
		// evenNums();
		// oddNums();
		// launchAborted();
		// nestedLoop();
		// leapYears();
		// ageChecker();
		// magicBall();
		anotherNestedLoop();

	}

}
