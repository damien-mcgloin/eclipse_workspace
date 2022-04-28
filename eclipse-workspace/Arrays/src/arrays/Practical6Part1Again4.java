/**
 * 
 */
package arrays;

/**
 * @author damienmcgloin
 *
 */

import java.util.Scanner;

public class Practical6Part1Again4 {

	/**
	 * @param args
	 */

	private static double RATE = 10.25;

	public static void salaryChecker() {

		int total = 0;
		int day = 0;

		int[] wages = { 8, 7, 9, 7, 4 };

		for (int loop = 0; loop < wages.length; loop++) {
			day++;
			total += wages[loop];
			System.out.println("Day : " + day + " Hours : " + wages[loop]);
		}
		System.out.println("\nThe final weekly salary is : " + total * RATE);

	}

	public static void tempArray() {

		double[] temperatures = { 3.4, 4.2, 9.0, 2.2, 4.5, 6.4, 3.1 };

		double total = 0;
		double minimum = temperatures[0];
		double maximum = temperatures[0];

		for (int loop = 0; loop < temperatures.length; loop++) {
			total += temperatures[loop];
			if (minimum > temperatures[loop]) {
				minimum = temperatures[loop];
			}
			if (maximum < temperatures[loop]) {
				maximum = temperatures[loop];
			}
		}

		System.out.println("The average temperature is : " + (total / temperatures.length));
		System.out.println("The maximum temperature is : " + maximum);
		System.out.println("The minimum temperature is : " + minimum);

	}

	public static void heightsArray() {

		double[] heights = { 1.4, 1.9, 1.31, 1.2 };
		double total = 0;
		double tallest = heights[0];
		double smallest = heights[0];

		for (int loop = 0; loop < heights.length; loop++) {
			total += heights[loop];
			if (tallest < heights[loop]) {
				tallest = heights[loop];
			}
			if (smallest > heights[loop]) {
				smallest = heights[loop];
			}
		}

		System.out.println("The average height is : " + total / heights.length);
		System.out.println("The tallest height is : " + tallest);
		System.out.println("The smallest height is : " + smallest);

	}

	public static void vowelCounter() {

		Scanner scanner = new Scanner(System.in);

		int vowelA = 0;
		int vowelE = 0;
		int vowelI = 0;
		int vowelO = 0;
		int vowelU = 0;

		char[] userLetter;
		String userInput;

		System.out.println("Enter your name...");
		userInput = scanner.next();
		userLetter = new char[userInput.length()];

		for (int loop = 0; loop < userInput.length(); loop++) {
			userLetter[loop] = userInput.charAt(loop);
		}

		for (int loop = 0; loop < userInput.length(); loop++) {
			switch (userLetter[loop]) {
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
		System.out.println("The number of A's : " + vowelA);
		System.out.println("The number of E's : " + vowelE);
		System.out.println("The number of I's : " + vowelI);
		System.out.println("The number of O's : " + vowelO);
		System.out.println("The number of U's : " + vowelU);

		scanner.close();

	}

	public static void evenArray() {

		int[] evenNums = new int[50];

		int nextFreeElement = 0;
		int total = 0;

		for (int loop = 1; loop <= 100; loop++) {
			if (loop % 2 == 0) {
				evenNums[nextFreeElement] = loop;
			}
			System.out.println(evenNums[nextFreeElement]);
		}
		for (int i : evenNums) {
			total += i;
		}
		System.out.println("The total is : " + total);

	}

	public static int total(int[] num) {

		int total = 0;

		for (int loop = 0; loop < num.length; loop++) {
			total += num[loop];
		}

		return total;

	}

	public static int averages(int[] assign1, int[] assign2) {

		int num = 0;
		double aver1 = 0;
		double aver2 = 0;

		aver1 = ((double) total(assign1) / assign1.length);
		aver2 = ((double) total(assign2) / assign2.length);

		double averTotal = aver1 + aver2;

		System.out.println("The average of assignment 1 is : " + aver1);
		System.out.println("The average of assignment 2 is : " + aver2);
		System.out.println("The average of both assignments is : " + (averTotal / 2));

		if (aver1 > aver2) {
			System.out.println("Assignment 1 has the highest average");
		} else if (aver1 < aver2) {
			System.out.println("Assignment 2 has the highest average");
		} else {
			System.out.println("Both assignments have the same average");
		}

		return num;

	}
	
	public static void quote() {
		
		String[] quoteArray = { "Continuous", "effort", "not", "strength", "nor", "intelligence", "is", "the",
				"key", "for", "unlocking", "our", "potential" };
		
		
		
		int wordCounter = 0;
		int letterCounter = 0;
		String smallest = quoteArray[0];
		String largest = quoteArray[0];
		
		for(int loop = 0; loop<quoteArray.length; loop++) {
			wordCounter++;
			letterCounter+=quoteArray[loop].length();
			if(smallest.length()>quoteArray[loop].length()) {
				smallest = quoteArray[loop];
			}
			if(largest.length()<quoteArray[loop].length()) {
				largest = quoteArray[loop];
			}
			System.out.print(quoteArray[loop]+" ");
		}
		System.out.println("\nThe total number of words is : "+wordCounter);
		System.out.println("The total number of letters is : "+letterCounter);
		System.out.println("The biggest word is : "+largest);
		System.out.println("The smallest word is : "+smallest);
		
	}

	public static void main(String[] args) {

		// salaryChecker();
		// tempArray();
		// heightsArray();
		// vowelCounter();
		// evenArray();
		// int[] assign1 = { 24, 42, 29, 66, 77 };
		// int[] assign2 = { 79, 68, 31, 22, 42 };
		// System.out.println(averages(assign1, assign2));
		// quote();
		
		int[][] exampleArray = new int[4][4];
		int num = 0;
		int total = 0;
		
		for(int outer = 0; outer < 4; outer++) {
			for(int inner = 0; inner<4; inner++) {
				num+=2;
				total+=num;
				exampleArray[outer][inner]+=num;
				System.out.print(exampleArray[outer][inner]+" ");
			}
			System.out.println();
		}
		System.out.println("The total is : "+total);
		System.out.println(exampleArray.length);
		System.out.println("The average is : "+(total/(exampleArray.length*exampleArray.length)));
	}

}
