/**
 * 
 */
package arrays;

/**
 * @author damienmcgloin
 *
 */

public class Practical6Part13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		double[] heightArray = { 1.4, 1.9, 1.31, 1.2 };
		double total = 0;
		
		for (int num1=0; num1<heightArray.length; num1++) {
			total+=heightArray[num1];
		}
		
		double max = 0;
		
		for (int num2=0; num2<heightArray.length; num2++) {
			if (heightArray[num2]>max) {
				max = heightArray[num2];
			}
		}
		
		double min = max;
		
		for (int num3=0; num3<heightArray.length; num3++) {
			if (heightArray[num3]<min) {
				min = heightArray[num3];
			}
		}
		
		double average = total/heightArray.length;
		System.out.println("The average is : "+average);
		System.out.println("The maximum is : "+max);
		System.out.println("The minimum is : "+min);
		
	}

}
