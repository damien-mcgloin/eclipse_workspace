/**
 * 
 */
package practicals;

/**
 * @author damienmcgloin
 *
 */

import java.util.Random;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;

public class Practical5Again2 {

	/**
	 * @param args
	 */

	public static void toLowerCase(char letter) {

		if (Character.isUpperCase(letter)) {
			System.out.println(Character.toLowerCase(letter));
		} else {
			System.out.println(letter);
		}

	}

	public static void randomNum() {

		Random random = new Random();

		System.out.println("Generating 10 random integers in range 1..100");

		for (int loop = 1; loop <= 10; loop++) {
			int randomNum = random.nextInt(100);
			randomNum++;
			System.out.println("Generated : " + randomNum);
		}
		System.out.println("Done");

	}

	public static void numStars(int num) {

		if (num >= 5 && num <= 50) {

			for (int outer = num; outer > 0; outer--) {
				System.out.print("\n" + outer + " ");
				for (int inner = 1; inner <= outer; inner++) {
					System.out.print("*");
				}
			}

		} else {
			System.out.println("Error : incorrect value entered");
		}
	}

	public static void amOrPm() {

		Calendar calendar = Calendar.getInstance();

		int time = calendar.get(Calendar.HOUR_OF_DAY);

		if (time < 12) {
			System.out.println("Good morning");
		} else {
			System.out.println("I hope the morning went well for you.");
		}

	}

	public static void averageCalculator(int num1, int num2, int num3) {

		int total = num1 + num2 + num3;

		double average = (double) total / 3;

		System.out.println(average);

	}

	public static void coinToss(String call) {

		Random random = new Random();

		int luck = random.nextInt(2);

		if (luck > 0) {
			System.out.println("heads");
		} else {
			System.out.println("tails");
		}

	}

	private static final double RATE = 10.22;

	public static void hoursAndWages() {

		int[] salary = { 8, 5, 9, 7, 4 };
		int day = 0;
		int total = 0;

		for (int loop = 0; loop < salary.length; loop++) {
			day++;
			total += salary[loop];
			System.out.println("Day : " + day + ", wages : " + salary[loop]);
		}

		System.out.println("Total hours : "+total);
		System.out.printf("Weekly salary is : %.2f", (total * RATE));

	}

	public static void averageTemp() {
		
		double[] temperatures = { 3.4, 4.2, 9.0, 2.2, 4.5, 6.4, 3.1 };
		
		double total = 0;
		
		for(int loop = 0; loop<temperatures.length; loop++) {
			total+=temperatures[loop];
		}
		
		System.out.println("The average is : "+(total/temperatures.length));
		
	}
	
	public static void heightArray() {
		
		double[] heights = { 1.4, 1.9, 1.31, 1.2 };
		
		double total = 0;
		double maximum = heights[0];
		double minimum = heights[0];
		
		for(int loop = 0; loop<heights.length; loop++) {
			total+=heights[loop];
			if(maximum<heights[loop]) {
				maximum = heights[loop];
			}
			if(minimum>heights[loop]) {
				minimum = heights[loop];
			}
		}
		
		System.out.println("The average height is : "+(total/heights.length));
		System.out.println("The tallest height is : "+maximum);
		System.out.println("The smallest height is : "+minimum);
		
	}
	
	public static void vowelCounter() {
		
		int vowelA = 0;
		int vowelE = 0;
		int vowelI = 0;
		int vowelO = 0;
		int vowelU = 0;
		
		System.out.println("Please enter your name...");
		
		Scanner scanner = new Scanner(System.in);
		String userName = scanner.nextLine();
		
		char[] userLetter = new char[userName.length()];
		
		for(int loop = 0; loop<userLetter.length; loop++) {
			userLetter[loop] = (char) userName.charAt(loop);
			
			switch(userLetter[loop]) {
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
			default:
			}
			
		}
		
		System.out.println("The number of A's : "+vowelA);
		System.out.println("The number of E's : "+vowelE);
		System.out.println("The number of I's : "+vowelI);
		System.out.println("The number of O's : "+vowelO);
		System.out.println("The number of U's : "+vowelU);
		
		scanner.close();
		
	}
	
	public static void evenNums() {
		
		int[] evens = new int[50];
		int nextFreeElement = 0;
		int total = 0;
		
		for(int loop = 1; loop<=100; loop++) {
			if(loop%2 == 0) {
			evens[nextFreeElement] = loop;
			nextFreeElement++;
			}
		}
		
		for (int i : evens) {
			total+=i;
		}
		
		System.out.println(Arrays.toString(evens));
		System.out.println("The total is : "+total);
		
	}
	
	public static int total(int[] exam) {
		
		int total = 0;
		
		for(int loop = 0; loop<exam.length; loop++) {
			total+=exam[loop];
		}
		
		return total;
		
	}
	
	public static void averages(int[] exam1, int[] exam2) {
		
		double aver1, aver2, totalAver;
		
		aver1 = (double) total(exam1)/exam1.length;
		aver2 = (double) total(exam2)/exam2.length;
		totalAver = (aver1+aver2)/2;
		
		System.out.println("The average of exam 1 is : "+aver1);
		System.out.println("The average of exam 2 is : "+aver2);
		System.out.println("The average of both exams is : "+totalAver);
		
		if(aver1>aver2) {
			System.out.println("The average of exam 1 is higher");
		} else if (aver1<aver2) {
			System.out.println("The average of exam 2 is higher");
		} else {
			System.out.println("The average of both exams is the same");
		}
		
	}
	
	public static void quote() {
		
		String[] quoteArray = { "Continuous", "effort", "not", "strength", "nor", "intelligence", "is", "the",
				"key", "for", "unlocking", "our", "potential" };
		
		int wordCounter = 0;
		int letterCounter = 0;
		String smallestWord = quoteArray[0];
		String largestWord = quoteArray[0];
		
		for(int loop = 0; loop<quoteArray.length; loop++) {
			wordCounter++;
			letterCounter+=quoteArray[loop].length();
			System.out.print(quoteArray[loop]+" ");
			if(smallestWord.length()>quoteArray[loop].length()) {
				smallestWord = quoteArray[loop];
			}
			if(largestWord.length()<quoteArray[loop].length()) {
				largestWord = quoteArray[loop];
			}
		}
		
		System.out.println("\nThe total number of words is : "+wordCounter);
		System.out.println("The total number of letters is : "+letterCounter);
		System.out.println("The smallest word is : "+smallestWord);
		System.out.println("The largest word is : "+largestWord);
		
	}
	
	public static void arrayExample() {
		
		int[][] example = new int [4][4];
		
		int counter = 0;
		int arrayLength = 0;
		int total = 0;
		
		for (int row = 0; row<example.length; row++) {
			System.out.println();
			for (int col = 0; col<example[row].length; col++) {
				counter+=2;
				total+=counter;
				arrayLength++;
				example[row][col]+=counter;
				System.out.print(example[row][col]+" ");
			}
		}
		
		System.out.println("\nThe total of the array is : "+total);
		System.out.println("The average is : "+(total/arrayLength));
		
	}
	
	public static int[] coded(String name) {
		
		int charLetter[] = new int [name.length()];
		
		for(int loop = 0; loop<name.length(); loop++) {
			charLetter[loop] = name.charAt(loop);
			System.out.print(charLetter[loop]+" ");
		}
		
		return charLetter;
		
	}
	
	public static int[] uncoded(int[] uncoded) {
		
		char charLetter[] = new char [uncoded.length];
		
		for(int loop = 0; loop<uncoded.length; loop++) {
			charLetter[loop] = (char) uncoded[loop];
			System.out.print(charLetter[loop]);
		}
		
		return uncoded;
		
	}
	
	public static void main(String[] args) {

		// toLowerCase('A');
		// randomNum();
		// numStars(4);
		// amOrPm();
		// averageCalculator(10, 11, 10);
		// coinToss("Heads");
		// hoursAndWages();
		// averageTemp();
		// heightArray();
		// vowelCounter();
		// evenNums();
		
		//int[] exam1 = { 24, 42, 29, 66, 77 };
		//int[] exam2 = { 79, 68, 31, 22, 42 };
		
		//averages(exam1, exam2);
		// quote();
		arrayExample();
		
		//int[] asciiArray = { 68, 97, 109, 105, 101, 110, 32, 77, 99, 71, 108, 111, 105, 110 };
		
		//coded("Damien McGloin");
		//System.out.println();
		//uncoded(coded("Damien McGloin"));

	}

}
