/**
 * 
 */
package arrays;

/**
 * @author damienmcgloin
 *
 */

import java.util.Scanner;

public class Practical6Part1Again3 {

	/**
	 * @param args
	 */
	
	private static final double RATE = 11.50; {
		
	}
	
	public static void salaryCounter() {
		
		int[] workingHours = { 8, 7, 9, 7, 4, 8 };
		
		int total = 0;
		int day = 0;
		
		for(int loop = 0; loop< workingHours.length; loop++) {
			total+=workingHours[loop];
			day++;
			System.out.println("Day : "+day+" Hours : "+workingHours[loop]);
		}
		System.out.println("The total hours worked are : "+total);
		System.out.printf("The total salary is : %.2f\n",(RATE*total));
	}
		
	public static void averageTemp() {
		
		double total = 0;
		
		double[] temperatures = { 3.4, 4.2, 9.0, 2.2, 4.5, 6.4, 3.1 };
		
		double maximum = temperatures[0];
		double minimum = temperatures[0];
		
		for(int loop = 0; loop<temperatures.length; loop++) {
			total+=temperatures[loop];
			if(maximum<temperatures[loop]) {
				maximum = temperatures[loop];
			}
			if(minimum>temperatures[loop]) {
				minimum = temperatures[loop];
			}
		}
		
		System.out.println("The average temperature is : "+(total/temperatures.length));
		System.out.println("The maximum temperature is : "+maximum);
		System.out.println("The minimum temperature is : "+minimum);
		
	}
	
	public static void heightCalculations() {
		
		double[] heights = { 1.4, 1.9, 1.31, 1.2 };
		
		double tallest = heights[0];
		double smallest = heights[0];
		double total = 0;
		
		for(int loop = 0; loop<heights.length; loop++) {
			total+=heights[loop];
			
			if(tallest<heights[loop]) {
				tallest = heights[loop];
			}
			
			if(smallest>heights[loop]) {
				smallest = heights[loop];
			}
		}
		
		System.out.println("The average height is : "+(total/heights.length));
		System.out.println("The tallest height is : "+tallest);
		System.out.println("The smallest height is : "+smallest);
		
	}
	
	public static void vowelCounter() {
		
		System.out.println("Enter your name...");
		
		Scanner scanner = new Scanner(System.in);
		String userName = scanner.next();
		char userLetter[] = new char [userName.length()];
		
		int vowelA = 0;
		int vowelE = 0;
		int vowelI = 0;
		int vowelO = 0;
		int vowelU = 0;
		
		for(int loop = 0; loop<userName.length(); loop++) {
			userLetter[loop] = userName.charAt(loop);
		}
		
		for(int loop = 0; loop<userName.length();loop++) {
			switch(userLetter[loop]) {
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
		
		for(int loop = 1; loop<100; loop++) {
			if(loop%2 == 0) {
				evens[nextFreeElement] = loop;
			}
			System.out.println(evens[nextFreeElement]);
		}
		
		for(int i : evens) {
			total+=i;
		}
		System.out.println("The total is : "+total);
		
	}
	
	public static int totalNum(int[] assign) {
		
		int total = 0;
		
		for (int loop = 0; loop<assign.length; loop++) {
			total+=assign[loop];
		}
		
		return total;
		
	}
	
	public static int averageCalculations(int[]assign1, int[]assign2) {
		
		int num = 0;
		double aver1 = (double)totalNum(assign1)/assign1.length;
		double aver2 = (double)totalNum(assign2)/assign2.length;
		
		System.out.println("The average of assignment 1 is : "+aver1);
		System.out.println("The average of assignment 2 is : "+aver2);
		
		if(aver1 > aver2) {
			System.out.println("The average of assignment 1 is higher");
		} else if (aver1 < aver2) {
			System.out.println("The average of assignment 2 is higher");
		} else {
			System.out.println("The average of both assignments is the same");
		}
		
		return num; 
		
	}
	
	public static void quote() {
		
		String[] quoteArray = { "Continuous", "effort", "not", "strength", "nor", "intelligence", "is",
				"the", "key", "for", "unlocking", "our", "potential" };
		
		int wordTotal = 0;
		int letterTotal = 0;
		String smallestLetter = quoteArray[0];
		String biggestLetter = quoteArray[0];
		
		for(int loop = 0; loop<quoteArray.length; loop++) {
			wordTotal++;
			letterTotal+=quoteArray[loop].length();
			
			if(smallestLetter.length()>quoteArray[loop].length()) {
				smallestLetter = quoteArray[loop];
			}
			if(biggestLetter.length()<quoteArray[loop].length()) {
				biggestLetter = quoteArray[loop];
			}
			System.out.print(quoteArray[loop]+" ");
		}
		System.out.println("\nThe total number of words is : "+wordTotal);
		System.out.println("The total number of letters is : "+letterTotal);
		System.out.println("The smallest letter is : "+smallestLetter);
		System.out.println("The biggest letter is : "+biggestLetter);
		
	}
	
	public static void main(String[] args) {
		
		//salaryCounter();
		//averageTemp();
		//heightCalculations();
		//vowelCounter();
		//evenNums();
		
		int[] assign1 = { 24, 42, 29, 66, 77 };
		int[] assign2 = { 79, 68, 31, 22, 42 };
		
		averageCalculations(assign1, assign2);
		//quote();

	}

}
