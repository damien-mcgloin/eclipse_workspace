/**
 * 
 */
package arrays;

/**
 * @author damienmcgloin
 *
 */
public class Practical6Part2Again1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int loop = 0;
		int total = 0;
		int num2 = 0;
		int[][] exampleArray = new int [4][4];
		
		for(int outer = 0; outer<4; outer++) {
			for(int inner = 0; inner<4; inner++) {
				loop+=2;
				total+=loop;
				num2++;
				exampleArray[outer][inner] = loop;
				System.out.print(exampleArray[outer][inner]+" ");
			}
			System.out.println();
		}
		System.out.println("The total is : "+total);
		System.out.println("The average is: "+(total/num2));

	}

}
