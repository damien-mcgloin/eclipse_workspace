/**
 * 
 */
package loopers;

/**
 * @author damienmcgloin
 *
 */
public class WhileUp2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int count;
		count = 1;
		
		while (count<11) {
			System.out.println("Count is " + count);
			count++;
		}
		
		System.out.println("End\n");
		
		int counter = 10;
		
		while (counter!=-1) {
			System.out.println(counter);
			counter--;
		}
		
		System.out.println("Blast off!!\n");
		
		int countEven;
		countEven = 2;
		
		while (countEven<=20) {
			if (countEven %2==0) {
				System.out.println(countEven);
			}
			countEven++;
		}
		
	}

}
