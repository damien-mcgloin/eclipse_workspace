/**
 * 
 */
package arrays;

/**
 * @author damienmcgloin
 *
 */
public class Practical1Part1Q9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String quoteArray[] = { "Continuous", "effort", "not", "strength", "nor", "intelligence", "is", "the", "key", "for", "unlocking", "our", "potential" };
		
		int totalWords=0;
		int numberOfLetters=0;
		String smallestWord = quoteArray[0];
		String largestWord = quoteArray[0];
	
		for(int loop=0; loop<quoteArray.length; loop++) {
			System.out.print(quoteArray[loop]+" ");
		}
		
		for(int loop=0; loop<quoteArray.length; loop++) {
			totalWords++;
			numberOfLetters+=quoteArray[loop].length();
			
			if(quoteArray[loop].length() > largestWord.length()) {
				largestWord = quoteArray[loop];
			}
			
			if(quoteArray[loop].length() < smallestWord.length()) {
				smallestWord = quoteArray[loop];
			}
			
		}
		
		
		System.out.println("\nThe total number of words is : "+totalWords);
		System.out.println("The total number of letters is : "+numberOfLetters);
		System.out.println("The largest word is : "+largestWord);
		System.out.println("The smallest word is : "+smallestWord);
		
	}
 
} // end of class
