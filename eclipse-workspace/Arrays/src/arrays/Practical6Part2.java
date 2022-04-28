/**
 * 
 */
package arrays;

/**
 * @author damienmcgloin
 *
 */
public class Practical6Part2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[][] a2DArray = new int [4][4];
		
		int number = 2;
		int total = 0;
		int numberOfElements=0;
		int average = 0;
		
		// populate 2d array like 2,4,6,8 etc
		for (int rowCounter=0; rowCounter<4; rowCounter++) {
			for (int colCounter=0; colCounter<4; colCounter++) {
				a2DArray[rowCounter][colCounter] = number;
				number+=2;
				total+=a2DArray[rowCounter][colCounter];
				numberOfElements++;
			}
		}
		
		for (int rowCounter=0; rowCounter<a2DArray.length; rowCounter++) {
			for (int colCounter=0; colCounter<a2DArray.length; colCounter++) {
				System.out.printf("[%d %d] : %d   ", rowCounter, colCounter, a2DArray[rowCounter][colCounter]);
			}
			System.out.println("\n");
		}
		System.out.println("The total is : "+total);
		average = total/numberOfElements;
		System.out.println("The average is : "+average);
	}

}
