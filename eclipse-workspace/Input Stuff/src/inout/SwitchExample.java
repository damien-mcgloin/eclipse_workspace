/**
 * 
 */
package inout;

/**
 * @author damienmcgloin
 *
 */
public class SwitchExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int num;
		num = 5;

		switch (num) {
		case 1:
			System.out.println("Number is a one");
			break;
		case 2:
			System.out.println("Number is a two");
			break;
		case 3:
			System.out.println("Number is a three");
			break;
		case 4:
			System.out.println("Number is a four");
			break;
		default:
			System.out.println("Unknown number");
		}
		System.out.println("done");

	}

}
