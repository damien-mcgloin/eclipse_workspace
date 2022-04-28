/**
 * 
 */
package arrays;

/**
 * @author damienmcgloin
 *
 */
public class Practical6Part2Again3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[][] exampleArray = new int[4][4];
		int loop = 0;
		int total = 0;
		
		for(int outer = 0; outer <= 3; outer++) {
			for(int inner = 0; inner <= 3; inner++) {
				loop+=2;
				exampleArray[outer][inner]+=loop;
				total+=exampleArray[outer][inner];
				System.out.print(exampleArray[outer][inner]+" ");
			}
			System.out.println();
		}
		
		System.out.println("The total is : "+total);
		System.out.println("The average is : "+total/exampleArray.length);

	}

}
