/**
 * 
 */
package arrays;

import java.util.Arrays;
/**
 * @author damienmcgloin
 *
 */
public class Practical6Walkthrough5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//quoteAnalyser();
		
		int count = 0;
		int[] array = { 11, 5, 5, 4, 3 };
		
		 int[] array1 = { array[0], array[1] };
		 int[] array2 = { array[2], array[3] };
		 
		 for(int loop = 0; loop<array1.length; loop++) {
			 count++;
		 }
		 
		 Arrays.sort(array2);
		 System.out.println(count);

	}
	
	public static void quoteAnalyser() {
		
		int numberWords = 0;
		int numberLetters = 0;
		String smallestWord;
		String largestWord ;
		
		String[] quote = { "Continuous", "effort", "not", "strength", "nor",
				"intelligence", "is", "the", "key", "for", "unlocking", "our", "potential" };
		
		smallestWord = quote[0];
		largestWord = quote[0];
		
		for (int loop=0; loop<quote.length; loop++) {
			
			// print out quote
			System.out.print(quote[loop]);
			System.out.print(" ");
			
			// keeping count of number of words
			numberWords++;
			
			// keep number of characters
			numberLetters+=quote[loop].length();
			
			if (quote[loop].length() > largestWord.length()) {
				largestWord = quote[loop];
			}
			
			if (quote[loop].length() < smallestWord.length()) {
				smallestWord = quote[loop];	
			
			}
			
		}
		System.out.println("\nNumber of words : "+numberWords);
		System.out.println("Number of letter : "+numberLetters);
		System.out.println("The largest word is : "+largestWord);
		System.out.println("The smallest word is : "+smallestWord);
	}

}
