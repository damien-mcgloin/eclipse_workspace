/**
 * 
 */
package arrays;

/**
 * @author damienmcgloin
 *
 */

import java.util.Scanner;

public class Practical6Part1Again {

	private static final double RATE = 11.50;

	{

	}

	public static void hoursAndWages() {

		int[] workHours = { 8, 7, 9, 7, 4, 8, 11 };

		int total = 0;
		int day = 0;

		for (int loop = 0; loop < workHours.length; loop++) {
			day++;
			total += workHours[loop];
			System.out.printf("Day %d : %d \n", day, workHours[loop]);
		}

		System.out.println("The total hours for the week are : " + total);
		System.out.printf("The weekly salary is : %.2f\n", (total * RATE));

	}

	public static void temperatures() {

		double[] temperaturesArray = { 3.4, 4.2, 9.0, 2.2, 4.5, 6.4, 3.1 };

		double total = 0;
		double maximum = temperaturesArray[0];
		double minimum = temperaturesArray[0];

		for (int loop = 0; loop < temperaturesArray.length; loop++) {
			total += temperaturesArray[loop];

			if (temperaturesArray[loop] > maximum) {
				maximum = temperaturesArray[loop];
			}

			if (temperaturesArray[loop] < minimum) {
				minimum = temperaturesArray[loop];
			}
		}

		System.out.println("The average temperature is : " + (total / temperaturesArray.length));

		// answer shortened to two decimal places
		System.out.printf("The average temperature is : %.2f\n", (total / temperaturesArray.length));
		System.out.println("The maximum temperature is : " + maximum);
		System.out.println("The minimum temperature is : " + minimum);

	}

	public static void Heights() {

		double[] heightArray = { 1.4, 1.9, 1.31, 1.2 };

		double total = 0;
		double tallest = heightArray[0];
		double smallest = heightArray[0];

		for (int loop = 0; loop < heightArray.length; loop++) {
			total += heightArray[loop];

			if (heightArray[loop] > tallest) {
				tallest = heightArray[loop];
			}

			if (heightArray[loop] < smallest) {
				smallest = heightArray[loop];
			}

		}
		System.out.println("The average height is : " + (total / heightArray.length));
		System.out.println("The tallest height is : " + tallest);
		System.out.println("The smallest height is : " + smallest);

	}

	public static void userName() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name...");

		String userInput = scanner.next();
		// String[] nameOfUser = { userInput };
		char[] lettersOfName = new char[userInput.length()];

		int totalA = 0;
		int totalE = 0;
		int totalI = 0;
		int totalO = 0;
		int totalU = 0;

		for (int loop = 0; loop < userInput.length(); loop++) {
			lettersOfName[loop] = userInput.charAt(loop);
		}

		for (int loop = 0; loop < userInput.length(); loop++) {

			switch (lettersOfName[loop]) {
			case 'a':
			case 'A':
				totalA++;
				break;
			case 'e':
			case 'E':
				totalE++;
				break;
			case 'i':
			case 'I':
				totalI++;
				break;
			case 'o':
			case 'O':
				totalO++;
				break;
			case 'u':
			case 'U':
				totalU++;
				break;
			default:
			}

		}

		System.out.println("The total occurrences of A : " + totalA);
		System.out.println("The total occurrences of E : " + totalE);
		System.out.println("The total occurrences of I : " + totalI);
		System.out.println("The total occurrences of O : " + totalO);
		System.out.println("The total occurrences of U : " + totalU);

		scanner.close();

	}

	public static void evenNumbers() {

		// array to hold even values
	    int[] evens = new int[50];
	    int nextFreeElement = 0;
	    int total=0;
	    
	    for (int loop=1;loop<=100;loop++){
	        
	        if (loop%2==0){
	            // even number - add to array
	            evens[nextFreeElement]=loop;
	            // update to point to next free element
	            nextFreeElement++;
	        }
	   
		}
	    
	    for (int i : evens) {
	    	total+=i;
	    }
	    System.out.println("total is : "+total);
		

	}
	
	public static void arrayExample() {
		
		int[] arrayOfInts = { 15, 29, 20, 74, 80, 93 };
		
		for (int loop = 0; loop<arrayOfInts.length; loop++) {
			System.out.println(arrayOfInts[loop]);
		}
		
	}
	
	public static void assignments(int[] assign1, int[] assign2) {
		
		double aver1, aver2;
		
		aver1 = (double)totalMarks(assign1)/assign1.length;
		aver2 = (double)totalMarks(assign2)/assign2.length;
		
		System.out.printf("The average mark of assignment 1 is : %.1f",aver1);
		
		System.out.printf("\nThe average mark of assignment 2 is : %.1f",aver2);
		
		System.out.println("\nThe average mark from both assignments is : "+(aver1+aver2)/2);
		
		if (aver1 > aver2) {
			System.out.println("The average for assignment 1 is higher");
		} else if (aver1 < aver2) {
			System.out.println("The average for assignment 2 is higher");
		} else {
			System.out.println("The averages for both assignments is the same");
		}
		
	}
	
	public static int totalMarks(int[] results) {
		
		int total = 0;
		
		for (int loop = 0; loop<results.length; loop++) {
			total+=results[loop];
		}
	
		return total;
	}

	/**
	 * @param args
	 */
	
	public static void quote() {
		
		String[] quoteArray = { "Continuous", "effort", "not", "strength", "nor", "intelligence", "is",
				"the", "key", "for", "unlocking", "our", "potential" };
		
		int numberOfWords = 0;
		int numberOfLetters = 0;
		String smallestWord = quoteArray[0];
		String largestWord = quoteArray[0];
		
		for(int loop = 0; loop<quoteArray.length; loop++) {
			numberOfWords++;
			numberOfLetters += quoteArray[loop].length();
			if(smallestWord.length() > quoteArray[loop].length()) {
				smallestWord = quoteArray[loop];
			}
			if(largestWord.length() < quoteArray[loop].length()) {
				largestWord = quoteArray[loop];
			}
			
		}
		
		System.out.println("The total number of words is : "+numberOfWords);
		System.out.println("The total number of letters is : "+numberOfLetters);
		System.out.println("The smallest word is : "+smallestWord);
		System.out.println("The largest word is : "+largestWord);
		
	}
	
	public static void main(String[] args) {

		// hoursAndWages();
		// temperatures();
		// Heights();
		// userName();
		// evenNumbers();
		// arrayExample();
		/*int[] assign1 = { 24, 42, 29, 66, 77 };
		int[] assign2 = { 79, 68, 31, 22, 42 };
		assignments(assign1, assign2);
		*/
		
		quote();

	}

}
