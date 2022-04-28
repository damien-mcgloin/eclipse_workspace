/**
 * 
 */
package arrays;

import java.util.Arrays;

/**
 * @author damienmcgloin
 *
 */

import java.util.Scanner;

public class Practical6Part1Again2 {

	/**
	 * @param args
	 */

	public static void exampleArray() {

		int[] nums = new int[5];
		int count = 0;
		// int val = 1;

		while (count < 15) {
			// nums[count%5]+=val;
			// val++;
			count++;
		}

		System.out.println(Arrays.toString(nums));

	}

	public static void quote() {

		String[] quoteArray = { "Continuous", "effort", "not", "strength", "nor", "intelligence", "is", "the", "key",
				"for", "unlocking", "our", "potential" };
		int wordCounter = 0;
		int letterCounter = 0;
		String maximum = quoteArray[0];
		String minimum = quoteArray[0];

		for (int loop = 0; loop < quoteArray.length; loop++) {
			System.out.print(quoteArray[loop] + " ");
			wordCounter++;
			letterCounter += quoteArray[loop].length();

			if (maximum.length() < quoteArray[loop].length()) {
				maximum = quoteArray[loop];
			}

			if (minimum.length() > quoteArray[loop].length()) {
				minimum = quoteArray[loop];
			}

		}

		System.out.println("\n\nThe total word count is : " + wordCounter);
		System.out.println("The total number of letters is : " + letterCounter);
		System.out.println("The biggest word is : "+maximum);
		System.out.println("The smallest word is : "+minimum);

	}

	public static void averageResults(int[] assign1, int[] assign2) {

		double aver1, aver2;
		aver1 = (double) totalResults(assign1) / assign1.length;
		aver2 = (double) totalResults(assign2) / assign2.length;

		System.out.printf("The average of assignment 1 is : %.1f\n", aver1);
		System.out.printf("The average of assignment 1 is : %.1f\n", aver2);

		if (aver1 > aver2) {
			System.out.println("The average of assignment 1 is higher");
		} else if (aver1 < aver2) {
			System.out.println("The average of assignment 2 is higher");
		} else {
			System.out.println("The average of both assignments is the same");
		}
	}

	public static int totalResults(int num[]) {

		int total = 0;
		for (int loop = 0; loop < num.length; loop++) {
			total += num[loop];
		}
		return total;
	}

	public static void evenNum() {

		int[] evenNums = new int[50];
		int total = 0;
		int nextFreeElement = 0;

		for (int loop = 1; loop <= 100; loop++) {

			if (loop % 2 == 0) {
				evenNums[nextFreeElement] = loop;
				nextFreeElement++;
			}

		}

		for (int i : evenNums) {
			total += i;
		}
		System.out.println("total is : " + total);

		for (int loop = 0; loop < evenNums.length; loop++) {
			System.out.println(evenNums[loop]);
		}

	}

	public static void vowelCounter() {

		Scanner scanner = new Scanner(System.in);

		int vowelA = 0;
		int vowelE = 0;
		int vowelI = 0;
		int vowelO = 0;
		int vowelU = 0;
		char[] userLetter;

		System.out.println("Please enter your name..");

		String userName = scanner.next();

		userLetter = new char[userName.length()];

		for (int loop = 0; loop < userName.length(); loop++) {
			userLetter[loop] = userName.charAt(loop);
		}

		for (int loop = 0; loop < userName.length(); loop++) {
			switch (userLetter[loop]) {
			case 'a':
			case 'A':
				vowelA++;
				break;
			case 'e':
			case 'E':
				vowelE++;
				break;
			case 'i':
			case 'I':
				vowelI++;
				break;
			case 'o':
			case 'O':
				vowelO++;
				break;
			case 'u':
			case 'U':
				vowelU++;
				break;
			}
		}

		System.out.println("The total number of A's is : " + vowelA);
		System.out.println("The total number of E's is : " + vowelE);
		System.out.println("The total number of I's is : " + vowelI);
		System.out.println("The total number of O's is : " + vowelO);
		System.out.println("The total number of U's is : " + vowelU);

		scanner.close();

	}

	public static void averageBigSmallHeight() {

		double[] heightArray = { 1.4, 1.9, 1.31, 1.2 };

		double total = 0;
		double tallest = heightArray[0];
		double smallest = heightArray[0];

		for (int loop = 0; loop < heightArray.length; loop++) {
			total += heightArray[loop];

			if (tallest < heightArray[loop]) {
				tallest = heightArray[loop];
			}

			if (smallest > heightArray[loop]) {
				smallest = heightArray[loop];
			}
		}

		System.out.println("The average height is : " + (total / heightArray.length));
		System.out.println("The smallest height is : " + smallest);
		System.out.println("The tallest height is : " + tallest);

	}

	public static void averageTemp() {

		double[] temperatures = { 3.4, 4.2, 9.0, 2.2, 4.5, 6.4, 3.1 };

		double total = 0;
		double maximum = temperatures[0];
		double minimum = temperatures[0];

		for (int loop = 0; loop < temperatures.length; loop++) {
			total += temperatures[loop];

			if (maximum < temperatures[loop]) {
				maximum = temperatures[loop];
			}

			if (minimum > temperatures[loop]) {
				minimum = temperatures[loop];
			}

		}

		System.out.println("\nThe average temperature is : " + (total / temperatures.length));
		System.out.println("The maximum temperature is : " + maximum);
		System.out.println("The minimum temperature is : " + minimum);

	}

	private static final double RATE = 11.50;

	public static void salaryCounter() {

		int[] salaryArray = { 8, 7, 9, 7, 4, 9, 2 };
		int total = 0;
		int day = 0;

		for (int loop = 0; loop < salaryArray.length; loop++) {
			total += salaryArray[loop];
			day++;
			System.out.printf("Day %d : Hours %d  ", day, salaryArray[loop]);
		}

		System.out.println("\nThe total number of hours worked : " + total);
		System.out.printf("The total salary for the week is : %.2f", (total * RATE));

	}

	public static void main(String[] args) {

		// salaryCounter();
		// averageTemp();
		// averageBigSmallHeight();
		// vowelCounter();
		// evenNum();

		// int[] assign1 = { 24, 42, 29, 66, 77 };
		// int[] assign2 = { 79, 68, 31, 22, 42 };

		// averageResults(assign1, assign2);

		quote();
		// exampleArray();

	}

}
