/**
 * 
 */
package extra;

/**
 * @author damienmcgloin
 *
 */
public class Finances {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// end of dec = 2200
		// end of Jan = 1600
		// end of Feb = 1000
		// end of mar = 400
		// end of apr = -200
		// end of may = -800
		// end of june = -1400
		// end of july = -2000
		// end of august = -2600
		// end of september = -3200
		
		int StartingTotal = 4177; //Sep 29th
		int currentTotal = 2859; //Nov 21st
		int currentSpending = StartingTotal - currentTotal;
		int average = 600;
		int expectedTotal = 2800;
		int counter = 0;
		
		System.out.println("The amount spent since october is : "+currentSpending);
		
		// oct 1 - 31 = 4177 - 3361 = 816
		// nov 2 - 19 = 502.29
		
		for(int loop = 10; loop>0; loop--) {
			counter++;
			System.out.println("month : "+counter+" : "+(expectedTotal = expectedTotal - average));
		}

	}

}
