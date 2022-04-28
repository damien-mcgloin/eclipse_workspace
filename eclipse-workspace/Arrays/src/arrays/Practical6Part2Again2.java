/**
 * 
 */
package arrays;

/**
 * @author damienmcgloin
 *
 */
public class Practical6Part2Again2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[][] exampleArray = new int [4][4];
		int loop = 0;
		int total = 0;
		int counter = 0;
		
		for(int outer = 0; outer<exampleArray.length; outer++) {
			for(int inner = 0; inner<exampleArray.length; inner++) {
				exampleArray[outer][inner] = loop+=2;
				total+=loop;
				counter++;
				System.out.print(exampleArray[outer][inner]+" ");
			}
			System.out.println();
		}
		
		System.out.println("The total is : "+total);
		System.out.println("The average is : "+(total/counter));

	}

}
