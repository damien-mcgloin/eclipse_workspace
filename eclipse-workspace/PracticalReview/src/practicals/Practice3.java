/**
 * 
 */
package practicals;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Calendar;

/**
 * @author damienmcgloin
 *
 */
public class Practice3 {
	
	
	public static int total(int[] num) {
		
		int total = 0;
		
		for(int loop = 0; loop<=num.length; loop++) {
			total+=num[loop];
		}
		
		return total;
		
	}

	public static double averages(int[] assign1, int[] assign2) {
		
		double num = 0;
		double aver1, aver2;
		
		aver1 = (double) total(assign1)/assign1.length;
		aver2 = (double) total(assign2)/assign2.length;
		
		System.out.println("The average of assignment 1 is : "+aver1);
		System.out.println("The average of assignment 2 is : "+aver2);
		
		return num;
		
	}
	
	public static void evenArray() {
		
		int[] evens = new int [50];
		
		int nextFreeElement = 0;
		int total=0;
		
		for(int loop = 1; loop<=100; loop++) {
			if(loop%2==0) {
				evens[nextFreeElement]=loop;
				nextFreeElement++;
			}
		}
		
		for(int i : evens) {
			total+=i;
		}
		
		System.out.println(Arrays.toString(evens));
		System.out.println("The total is : "+total);
		
		
		
	}
	
	public static void letterCounter() {
		
		int vowelA = 0;
		int vowelE = 0;
		int vowelI = 0;
		int vowelO = 0;
		int vowelU = 0;
		
		System.out.println("Enter your name...");
		
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		
		char[] letter = new char[name.length()];
		
		for(int loop = 0; loop<name.length();loop++) {
			letter[loop] = name.charAt(loop);
		
			switch(letter[loop]) {
			case 'A':
			case 'a':
				vowelA++;
				break;
			case 'E':
			case 'e':
				vowelE++;
				break;
			case 'I':
			case 'i':
				vowelI++;
				break;
			case 'O':
			case 'o':
				vowelO++;
				break;
			case 'U':
			case 'u':
				vowelU++;
				break;
			default:
			}
			
		}
		
		System.out.println("The number of A's is : "+vowelA);
		System.out.println("The number of E's is : "+vowelE);
		System.out.println("The number of I's is : "+vowelI);
		System.out.println("The number of O's is : "+vowelO);
		System.out.println("The number of U's is : "+vowelU);
		
		scanner.close();
		
		
	}
	
	public static final double RATE = 10.25;
	
	public static void coinToss(String guess) {
		
		Random random = new Random();
		
		int luck = random.nextInt(2);
		
		if(luck>0) {
			System.out.println("heads");
		} else {
			System.out.println("tails");
		}
		
	}
	
	public static void myName() {
		
		String name = "Damien McGloin";
		
		System.out.println(name);
		
	}
	
	public static void exampleLoop() {

		for(int loop = 1; loop<=10; loop++) {
			System.out.println(loop);
		}

	}

	public static void timeOfDay() {

		Calendar calendar = Calendar.getInstance();

		int time = calendar.get(Calendar.HOUR_OF_DAY);

		if (time > 11) {
			System.out.println("I hope you had a good morning");
		} else {
			System.out.println("Good morning");
		}

	}

	public static void sumOfNum(int num) {

		int total = 1;
		double counter = 1;

		for (int loop = num - 1; loop >= 1; loop--) {
			total++;
			counter++;
			total += loop;
		}

		System.out.println("The sum is " + total);
		System.out.printf("The average is %.1f", (total / counter));

	}

	public static void numStars(int num) {

		if (num >= 5 && num <= 50) {
			for (int outer = num; outer >= 1; outer--) {
				System.out.print(outer + " ");
				for (int inner = 1; inner <= outer; inner++) {
					System.out.print("*");
				}
				System.out.println();
			}
		} else {
			System.out.println("Error: insert value between 5 and 50");
		}

	}

	public static void randomNumGenerator() {

		Random random = new Random();

		System.out.println("Generating 10 random integers in range 1..100");

		for (int loop = 1; loop <= 10; loop++) {
			int num = random.nextInt(100);
			num++;
			System.out.println("Generated : " + num);
		}

		System.out.println("Done");

	}

	public static void convertFromUpperToLower(char letter) {

		if (Character.isUpperCase(letter)) {
			System.out.println(Character.toLowerCase(letter));
		} else {
			System.out.println(letter + " is already lower case");
		}

	}

	public static void oddOrEven(int num) {

		if (num % 2 == 0) {
			System.out.println(num + " is an even number.");
		} else {
			System.out.println(num + " is an odd number.");
		}

	}

	public static void ageChecker() {

		int age;
		age = 0;

		// set up scanner
		Scanner scanner = new Scanner(System.in);

		try {
			// get age - keep prompting if outside the range
			do {
				System.out.println("Enter your age ... ");
				age = scanner.nextInt();
				// clear the last new line char entered as it will interfere
				// with new input if it is required
				scanner.nextLine();
			} while (age < 1 || age > 120);

			if (age >= 1 && age <= 30) {
				System.out.println("You are young");
			} else if (age >= 31 && age <= 60) {
				System.out.println("You are getting on!");
			} else {
				System.out.println("You look amazing for your age!");
			}
		} catch (Exception ex) {
			// got here with a problem. Leaving program gracefully.
			System.out.println("Sorry, problem with your input.");
		}
		// last thing to do - close the scanner
		scanner.close();
	}

	public static void nestedForLoop() {

		for (int outer = 1; outer <= 3; outer++) {
			System.out.println();
			for (int inner = 1; inner <= 10; inner++) {
				if (outer == 1) {
					System.out.print("*" + inner);
				} else if (outer == 2) {
					System.out.print("**" + inner);
				} else {
					System.out.print("***" + inner);
				}

				if (inner != 10) {
					System.out.print(",");
				}
			}
		}

	}

	public static void launchAborted() {

		for (int loop = 1000; loop >= 0; loop--) {
			System.out.println(loop);
			if (loop == 333) {
				System.out.println("Launch aborted!");
				break;
			}
		}

	}

	/**
	 * 
	 */
	public static void countDown() {

		int loop = 11;

		while (loop >= 2) {
			loop--;
			System.out.print(loop + ",");
		}
		System.out.print("Liftoff!");

	}

	/**
	 * 
	 */
	public static void forLoop() {

		for (int loop = 1; loop <= 10; loop++) {
			if (loop < 10) {
				System.out.print(loop + ",");
			} else {
				System.out.print(loop);
			}
		}

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

			System.out.println("Select option ...");

			userInput = scanner.nextInt();

		} while (userInput != 5);

		switch (userInput) {
		case 1:
			System.out.println("File selected");
			break;
		case 2:
			System.out.println("Edit selected");
			break;
		case 3:
			System.out.println("Save selected");
			break;
		case 4:
			System.out.println("Delete selected");
			break;
		case 5:
			System.out.println("Exit selected");
			break;
		default:
			System.out.println("Error : Unknown value entered");
		}

		scanner.close();

	}

	public static void sumAndNum() {

		int sum, num;
		sum = 0;
		num = 1;

		while (num < 11) {
			sum += num;
			num++;
		}

		System.out.println("The sum is : " + sum);

	}
	
	public static void arrayExample() {
		
		int[][] array = new int[4][4];
		
		int counter = 0;
		int length = 0;
		int total = 0;
		
		for(int row = 0; row<=3; row++) {
			System.out.println();
			for(int col = 0; col<=3; col++) {
				length++;
				counter+=2;
				total+=counter;
				array[row][col]+=counter;
				System.out.print(array[row][col]+" ");
			}
		}
		
		System.out.println("\nThe total is : "+total);
		System.out.println("The average is : "+(total/length));
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// sumAndNum();
		// menu();
		// forLoop();
		// countDown();
		// launchAborted();
		// nestedForLoop();
		// ageChecker();
		// oddOrEven(11);
		// convertFromUpperToLower('h');
		// randomNumGenerator();
		// numStars(10);
		// sumOfNum(100);
		//timeOfDay();
		// exampleLoop();
		// myName();
		// coinToss("heads");
		// letterCounter();
		// evenArray();
		
		//averages(assignment1, assignment2);
		
		//int[] assignment1 = { 24, 42, 29, 66, 77 };
		//int[] assignment2 = { 79, 68, 31, 22, 42 };
		
		//arrayExample();
		
		int day;
		String outputString;
		day = 5;

		switch (day) {
		case 1:
			outputString = "Sun";
		case 2:
			outputString = "Mon";
		case 3:
			outputString = "Tues";
		case 4:
			outputString = "Wed";
		case 5:
			outputString = "Thurs";
		case 6:
			outputString = "Fri";
		case 7:
			outputString = "Sat";
		default:
			outputString = "Unknown";
		}
		System.out.println(outputString);
	
 
	}

}
