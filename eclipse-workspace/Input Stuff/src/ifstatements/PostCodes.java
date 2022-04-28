/**
 * 
 */
package ifstatements;

/**
 * @author damienmcgloin
 *
 */
public class PostCodes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String postCode;
		postCode = "BT11";
		
		switch (postCode) {
		case "BT9":
		case "BT11":
		case "BT2":
		case "BT5":
			System.out.println("Belfast");
			break;
		case "BT32":
			System.out.println("Banbridge");
			break;
		case "BT33":
			System.out.println("Newcastle");
			break;
		default:
			System.out.println("Unknown");
		}

	}

}
