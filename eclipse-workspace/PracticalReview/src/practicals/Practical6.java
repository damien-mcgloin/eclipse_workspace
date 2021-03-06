/**
 * 
 */
package practicals;

import java.util.Arrays;

/**
 * @author damienmcgloin
 *
 */
public class Practical6 {

	/**
	 * @param args
	 */

	public static void vowelCounter(String name) {

		int vowelA = 0;
		int vowelE = 0;
		int vowelI = 0;
		int vowelO = 0;
		int vowelU = 0;

		char[] userLetter = new char[name.length()];

		for (int loop = 0; loop < name.length(); loop++) {
			userLetter[loop] = name.charAt(loop);

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

		System.out.println("The total A's are : " + vowelA);
		System.out.println("The total E's are : " + vowelE);
		System.out.println("The total I's are : " + vowelI);
		System.out.println("The total O's are : " + vowelO);
		System.out.println("The total U's are : " + vowelU);

	}

	public static int total(int[] assign) {

		int total = 0;

		for (int loop = 0; loop < assign.length; loop++) {
			total += assign[loop];
		}

		return total;

	}

	public static void averages(int[] assign1, int[] assign2) {

		double aver1, aver2, totalAver;

		aver1 = (double) total(assign1) / assign1.length;
		aver2 = (double) total(assign2) / assign2.length;

		totalAver = (aver1 + aver2) / 2;

		System.out.printf("The average of assignment 1 is : %.1f", aver1);
		System.out.printf("\nThe average of assignment 2 is : %.1f", aver2);
		System.out.printf("\nThe total average of both assignments is : %.1f\n", totalAver);

		if (aver1 > aver2) {
			System.out.println("The average of assignment 1 is greater.");
		} else if (aver1 < aver2) {
			System.out.println("The average of assignment 2 is greater.");
		} else {
			System.out.println("The average of each assignment is the same.");
		}

	}

	public static void quote() {

		String[] quoteArray = { "Continuous", "effort", "not", "strength", "nor", "intelligence", "is", "the", "key",
				"for", "unlocking", "our", "potential" };

		int wordCounter = 0;
		int letterCounter = 0;
		String smallestWord = quoteArray[0];
		String largestWord = quoteArray[0];

		for (int loop = 0; loop < quoteArray.length; loop++) { // open for
			wordCounter++;
			letterCounter += quoteArray[loop].length();
			System.out.print(quoteArray[loop] + " ");
			if (smallestWord.length() < quoteArray[loop].length()) { // open if
				smallestWord = quoteArray[loop];
			} // close if
			if (largestWord.length() > quoteArray[loop].length()) { // open if
				largestWord = quoteArray[loop];
			} // close if
		} // close for

		System.out.println("\nThe total number of words is : " + wordCounter);
		System.out.println("The total number of letters is : " + letterCounter);
		System.out.println("The smallest word is : " + smallestWord);
		System.out.println("The largest word is : " + largestWord);

	}

	public static void exampleArray() {

		int[][] example = new int[4][4];

		int counter = 0;
		int total = 0;

		for (int outer = 0; outer < example.length; outer++) {
			for (int inner = 0; inner < example.length; inner++) {
				counter += 2;
				total += counter;
				example[outer][inner] = counter;
				System.out.print(example[outer][inner] + " ");
			}
			System.out.println();
		}

		System.out.println("The total is : " + total);
		int arraySize = example.length * example.length;
		System.out.println("The average is : " + (total / arraySize));

	}

	public static void evenArray() {

		int[] evens = new int[101];

		for (int loop = 1; loop <= 100; loop++) {
			if (loop % 2 == 0) {
				evens[loop] = loop;
				System.out.print(evens[loop] + " ");
			}
		}
	}

	public static void evenArrayAgain() {

		int[] evens = new int[50];
		int nextFreeElement = 0;
		int total = 0;

		for (int loop = 1; loop <= 100; loop++) {
			if (loop % 2 == 0) {
				evens[nextFreeElement] = loop;
				nextFreeElement++;
			}
		}

		for (int T : evens) {
			total += T;
		}

		System.out.println(Arrays.toString(evens));

		System.out.println(total);

	}

	public static void namePrinter() {

		String name = "Damien McGloin";

		for (int loop = 1; loop <= 100; loop++) {
			System.out.println(name);
		}

	}

	public static int numAdder(int num1, int num2) {

		return num1 + num2;

	}

	public static void exampleArray2() {

		int[][] example = new int[4][4];

		int bananas = 1;

		for (int row = 0; row < example.length; row++) {
			System.out.println();
			for (int col = 0; col < example[row].length; col++) {
				example[row][col] = bananas;
				bananas *= 2;
				System.out.print(example[row][col] + " ");
			}
		}

	}

	/**
	 * 
	 * 
	 * 
	 * @param countryName
	 * 
	 * @return
	 * 
	 */

	public static String returnCity(String countryName) {

		String city;

		city = null;

		switch (countryName) {

		case "France":

			city = "Paris";

			break;

		case "Germany":

			city = "Berlin";

			break;

		case "Italy":

			city = "Rome";

			break;

		case "Japan":

			city = "Tokyo";

			break;

		case "Russia":

			city = "Moscow";

			break;

		case "UK":

			city = "London";

			break;

		case "America":

			city = "Washington";

			break;

		default:

			System.out.println("Invalid G8 country");

		}

		return city;

	}

	public static void main(String[] args) {

		// vowelCounter("Damien");

		// int[] assign1 = { 24, 42, 29, 66, 77 };
		// int[] assign2 = { 79, 68, 31, 22, 42 };

		// averages(assign1, assign2);

		// quote();

		// exampleArray();

		// int num1, num2;

		// num1 = 4;
		// num2 = 7;

		// System.out.println(numAdder(4, 7));

		// evenArray();
		// evenArrayAgain();;
		// namePrinter();

		//exampleArray2();
		returnCity("France");

	}

}
