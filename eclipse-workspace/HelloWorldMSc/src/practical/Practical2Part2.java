/**
 * 
 */
package practical;


/**
 * This is part 2 of the 2nd week 1 programming practical
 * @author damienmcgloin
 *
 */
public class Practical2Part2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String ownName;
		ownName = "Damien McGloin";
		
		// This will print my name
		System.out.println(ownName);
		// This will print the length of my name
		System.out.println("Length of my name is "+ownName.length());
		// This will print the first character of my name
		System.out.println(ownName.charAt(0));
		// This will print the second character of my name
		System.out.println(ownName.charAt(1));
		// This will replace the lowercase characters with upper case
		System.out.println(ownName.toUpperCase());
		// This will replace 'a' with '%'
		System.out.println(ownName.replace("a", "%"));
		// This will print the position of the first 'n'
		System.out.println(ownName.indexOf("n"));
		// This will print the position of the last 'n'
		System.out.println(ownName.lastIndexOf("n"));
	}

}
