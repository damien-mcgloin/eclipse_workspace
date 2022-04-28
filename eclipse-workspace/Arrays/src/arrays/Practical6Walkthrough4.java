/**
 * 
 */
package arrays;

/**
 * @author damienmcgloin
 *
 */
public class Practical6Walkthrough4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] assignment1 = { 24, 42, 29, 66, 77 };

		int[] assignment2 = { 79, 68, 31, 22, 42 };

		assignmentAnalyser(assignment1, assignment2);

	}

	/**
	 * 
	 * @param results
	 * @return
	 */
	public static int totalMarks(int[] results) {

		int total = 0;

		for (int loop = 0; loop < results.length; loop++) {
			total += results[loop];
		}

		return total;

	}

	public static void assignmentAnalyser(int[] assign1, int[] assign2) {

		double aver1, aver2;

		// calculate the total for assign 1
		aver1 = (double) totalMarks(assign1)/assign1.length;
		// calculate the total for assign 2
		aver2 = (double) totalMarks(assign2)/assign2.length;
		
		System.out.printf("Average mark assignment 1 : %.1f \n",aver1);
		System.out.printf("Average mark assignment 2 : %.1f \n",aver2);
		
		System.out.printf("Overall average : %.1f \n", (aver1+aver2)/2);
		
		if (aver1 > aver2) {
			System.out.println("Assignment 1 has the biggest average");
		} else if (aver2 > aver1) {
			System.out.println("Assignment 2 has the highest average");
		} else {
			System.out.println("The average of each assignment is the same");
		}
		

	}

}
