/**
 * 
 */
package exceptional;

/**
 * @author damienmcgloin
 *
 */
public class CallStack {

	/**
	 * @param args
	 */
/*
	public static void showValue(int index){
			int[] myArray = { 1,2,3,4,5 };
			System.out.println("Value is : "+myArray[index]);
	}
			
	public static void getValue(){
			int index = 7;
			showValue(index);
	}
*/	
	public static void main(String[] args) {

		try {
		int[] myArray = { 1, 2 ,3, 4 };
		
		for (int loop = 0; loop < 6; loop++) {
			System.out.println(myArray[loop]);
		}
		} catch (Exception exception) {
			System.out.println("Have a problem !");
		}
		
	}
}