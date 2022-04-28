/**
 * 
 */
package firstcode;

/**
 * @author damienmcgloin
 *
 *
 */
public class VarsByteExample2 {

	/**
	 * This class is an example of how you declare and use a byte
	 * @param args
	 */
	public static void main(String[] args) {
		
		// declare the byte
		byte myFirstByte;
		
		//assign a value to the var
		myFirstByte = 56;
		
		System.out.println("Initial Value: " +myFirstByte);

		//play with code...
		myFirstByte = -127;
				
		System.out.println("And changed to : " +myFirstByte);
		
		myFirstByte = 12;
		
		System.out.println("And changed to " +myFirstByte);
		
		myFirstByte = 90;
		
		System.out.println("Then to " +myFirstByte);
		
		myFirstByte = -110;
		
		System.out.println("And finally " +myFirstByte);
	}

}
