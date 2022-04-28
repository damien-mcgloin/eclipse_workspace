package practicals;
/**
 * 
 */

/**
 * @author damienmcgloin
 *
 */
public class Practical2 {

	/**
	 * @param args
	 */
	
	public static void ages() {
		
		int yearOfBirth, yearWhenITurn21, yearWhenITurn40, yearWhenIRetireAt60;
		
		yearOfBirth = 1990;
		yearWhenITurn21 = yearOfBirth+21;
		yearWhenITurn40 = yearOfBirth+40;
		yearWhenIRetireAt60 = yearOfBirth+60;
		
		System.out.println("Birth : "+yearOfBirth);
		System.out.println("Turn 21 : "+yearWhenITurn21);
		System.out.println("Turn 40 : "+yearWhenITurn40);
		System.out.println("Retire : "+yearWhenIRetireAt60);
		
	}
	
	public static void ifStatements() {
		
		int num1 = 44;
		int num2 = 44;
		
		if(num1>num2) {
			System.out.println("Num 1 is larger");
		} else if (num1<num2) {
			System.out.println("Num 2 is larger");
		} else {
			System.out.println("Num 1 and Num 2 are the same");
		}
		
	}
	
	public static void shapeCalculations() {
		
		int length = 6;
		int area = length*length;
		System.out.println("The area of the square is : "+area);
		
		double radius = 9;
		double PI = 3.142;
		System.out.printf("The area of the circle is %.2f",PI*(radius*radius));
		
	}
	
	public static void tabsAndSpaces() {
		
		System.out.println("Hello world! I am alive.");
		System.out.println("\nI can write on two lines!\n");
		System.out.println("    Happy Christmas");
		System.out.println("\t      *");
		System.out.println("\t     ***");
		System.out.println("\t    *****");
		System.out.println("\t   *******");
		
		System.out.println("\nFirst Witch\t When shall we three meet again?");
		System.out.println("\t\t In thunder, lightning, or in rain?");
		System.out.println("Second Witch\t When the hurlyburly's done,");
		System.out.println("\t\t When the battle's lost and won.");
		System.out.println("Third Witch\t That will be ere the set of sun.");
		
	}
	
	public static void example() {
		
		String name = "Damien McGloin";
		System.out.println(name);
		System.out.println(name.length());
		System.out.println(name.charAt(0));
		System.out.println(name.charAt(1));
		System.out.println(name.toUpperCase());
		System.out.println(name.replace('a', '%'));
		System.out.println(name.indexOf('n'));
		System.out.println(name.lastIndexOf('n'));
		
	}
	
	public static void main(String[] args) {
		
		//tabsAndSpaces();
		//example();
		//shapeCalculations();
		//ifStatements();
		ages();

	}

}
