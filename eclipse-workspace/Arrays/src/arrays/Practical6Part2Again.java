/**
 * 
 */
package arrays;

/**
 * @author damienmcgloin
 *
 */
public class Practical6Part2Again {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[][] arrayExample = new int [4][4];
		int num = 2;
		int total = 0;
		int average = 0;
		
		for (int outer = 0; outer<arrayExample.length; outer++) {
			for (int inner = 0; inner<arrayExample.length; inner++) {
				arrayExample[outer][inner] = num;
				num+=2;
				total+=arrayExample[outer][inner];
				average++;
				System.out.print(arrayExample[outer][inner]);
				System.out.print("   ");
				if (arrayExample[outer][inner] < 10) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("The total is : "+total);
		System.out.println("The average is : "+(total/average));
		
		

	}

}
