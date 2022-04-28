/**
 * 
 */
package arrays;

/**
 * @author damienmcgloin
 *
 */

import java.util.Scanner;

public class Practical6Part1Again1 {

	/**
	 * @param args
	 */

	private static final double RATE = 11.50;

	public static void calculateHoursAndSalary() {

		int[] workHours = { 8, 7, 9, 7, 4, 7 };
		int total = 0;
		int day = 0;

		for (int loop = 0; loop < workHours.length; loop++) {
			total += workHours[loop];
			day++;
			System.out.printf("Day %d : %d hours ", day, workHours[loop]);
		}

		System.out.println("\nThe total is : " + total);
		System.out.printf("The weekly salary is : %.2f\n", (total * RATE));

	}

	public static void temperatureAverage() {

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

		System.out.println("The average temperature is : " + (total / temperatures.length));
		System.out.println("The maximum tenperature is : " + maximum);
		System.out.println("The minimum tenperature is : " + minimum);

	}

	public static void averageTallestSmallestHeight() {

		double[] heights = { 1.4, 1.9, 1.31, 1.2 };
		double total = 0;
		double tallest = heights[0];
		double smallest = heights[0];

		for (int loop = 0; loop < heights.length; loop++) {
			total += heights[loop];

			if (smallest > heights[loop]) {
				smallest = heights[loop];
			}

			if (tallest < heights[loop]) {
				tallest = heights[loop];
			}
		}

		System.out.println("The average height is : " + (total / heights.length));
		System.out.println("The smallest is : " + smallest);
		System.out.println("The tallest is : " + tallest);

	}

	public static void vowelCounter() {

		String userName;
		char[] charLetter;

		int vowelA = 0;
		int vowelE = 0;
		int vowelI = 0;
		int vowelO = 0;
		int vowelU = 0;

		System.out.println("Enter your name...");
		Scanner scanner = new Scanner(System.in);

		userName = scanner.next();
		charLetter = new char[userName.length()];

		for (int loop = 0; loop < userName.length(); loop++) {
			charLetter[loop] = userName.charAt(loop);
		}

		for (int loop = 0; loop < charLetter.length; loop++) {

			switch (charLetter[loop]) {
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
		System.out.println("The total number of A's is : " + vowelA);
		System.out.println("The total number of E's is : " + vowelE);
		System.out.println("The total number of I's is : " + vowelI);
		System.out.println("The total number of O's is : " + vowelO);
		System.out.println("The total number of U's is : " + vowelU);

		scanner.close();

	}

	public static void evenNumTotal() {

		int[] evenNum = new int[50];
		int nextFreeElement = 0;
		int total = 0;

		for (int loop = 1; loop <= 100; loop++) {
			if (loop % 2 == 0) {
				evenNum[nextFreeElement] = loop;
				nextFreeElement++;
			}

		}
		
		for (int i : evenNum) {
			total+=i;
		}

		for (int loop = 0; loop < evenNum.length; loop++) {
			System.out.println(evenNum[loop]);
		}

		System.out.println("The total is : " + total);

	}
	
	public static void assignments(int[] assign1, int[] assign2) {
		
		double aver1, aver2;
		
		aver1 = (double)totalMarks(assign1)/assign1.length;
		aver2 = (double)totalMarks(assign2)/assign2.length;
		
		System.out.printf("The average mark of assignment 1 is : %.1f",aver1);
		System.out.printf("\nThe average mark of assignment 2 is : %.1f",aver2);
		System.out.println("\nThe average mark of both assignments is : "+(aver1+aver2)/2);
		
		if (aver1 > aver2) {
			System.out.println("Assignment 1 has the highest average");
		} else if (aver1 < aver2) {
			System.out.println("Assignment 2 has the highest average");
		} else {
			System.out.println("The average of both assignments is the same");
		}
		
		}
		
	public static int totalMarks(int[] results) {
		
		int total = 0;
		for (int loop = 0; loop<results.length; loop++) {
			total+=results[loop];
		}
		
		return total;
		
	}
	
	public static void quote() {
		
		String[] quoteArray = { "Continuous", "effort", "not", "strength", "nor", "intelligence", "is",
				"the", "key", "for", "unlocking", "our", "potential" };
		
		int total = 0;
		int letters = 0;
		String smallestWord = quoteArray[0];
		String largestWord = quoteArray[0];
		
		for(int loop = 0; loop<quoteArray.length; loop++) {
			total++;
			letters+=quoteArray[loop].length();
			System.out.print(quoteArray[loop]+" ");
			
			if(smallestWord.length()>quoteArray[loop].length()) {
				smallestWord = quoteArray[loop];
			}
			
			if(largestWord.length()<quoteArray[loop].length()) {
				largestWord = quoteArray[loop];
			}
			
		}
		System.out.println("\nThe total number of words is : "+total);
		System.out.println("The total number of letters is : "+letters);
		System.out.println("The smallest word is : "+smallestWord);
		System.out.println("The largest word is : "+largestWord);
		
		
	}

	public static void main(String[] args) {

		calculateHoursAndSalary();
		System.out.println();
		temperatureAverage();
		System.out.println();
		averageTallestSmallestHeight();
		System.out.println();
		// vowelCounter();
		System.out.println();
		evenNumTotal();
		System.out.println();
		
		int[] assign1 = { 24, 42, 29, 66, 77 };
		int[] assign2 = { 79, 68, 31, 22, 42 };
		assignments(assign1, assign2);
		System.out.println();
		
		quote();

	}

}
