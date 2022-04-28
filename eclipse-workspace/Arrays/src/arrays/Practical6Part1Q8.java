/**
 * 
 */
package arrays;

/**
 * @author damienmcgloin
 *
 */
public class Practical6Part1Q8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		double total1=0;
		double total2=0;
		int [] assignment1 = { 24, 42, 29, 66, 77 };
		int [] assignment2 = { 79, 68, 31, 22, 42 };
		
		for(int loop = 0; loop<assignment1.length; loop++) {
			total1+=assignment1[loop];
		}
		double average1 = total1/assignment1.length;
		System.out.printf("The average of assignment 1 is : %.1f",average1);
		
		for(int loop = 0; loop<assignment2.length; loop++) {
			total2+=assignment2[loop];
		}
		double average2 = total2/assignment2.length;
		System.out.printf("\nThe average of assignment 2 is : %.1f",average2);
		
		double total3 = average1+average2;
		System.out.println("\nThe average from both assignments is : "+total3/2);
		
		if (average1>average2) {
			System.out.println("Assignment 1 has the highest average");
		} else if (average2>average1) {
			System.out.println("Assignment 2 has the highest average");
		} else {
			System.out.println("The average of each assignment is the same");
		}


	}

}
