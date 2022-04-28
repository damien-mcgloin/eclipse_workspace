/**
 * 
 */
package arrays;

/**
 * @author damienmcgloin
 *
 */
public class ArrayExample3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*
		int[] family = new int[5];
		
		family[0] = 64;
		family[1] = 64;
		family[2] = 36;
		family[3] = 34;
		family[4] = 30;
		*/
		
		int[] family = { 64, 64, 36, 34, 30 };
		
		System.out.println("Dad "+family[0]);
		System.out.println("Mum "+family[1]);
		System.out.println("Jenny "+family[2]);
		System.out.println("Colin "+family[3]);
		System.out.println("Me "+family[4]);
		
		for (int loop=0; loop<family.length; loop++) {
			System.out.println(family[loop]);
		}
	}

}
