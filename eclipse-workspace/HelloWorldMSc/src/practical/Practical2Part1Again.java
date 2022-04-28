/**
 * 
 */
package practical;

/**
 * This attempt 2 at week 1 practical part 1
 * @author damienmcgloin
 *
 */
public class Practical2Part1Again {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Hello world ! I am alive.");
		
		System.out.printf("Hello world! I am alive\nI can write on two lines!\n");
		
		System.out.printf("Hello world! I am alive.\n\nI can write on two lines!\n\n");
		
		System.out.println("\t  Happy Christmas");
		
		System.out.println("\n\t\t   *");
		System.out.println("\t\t  ***");
		System.out.println("\t\t *****");
		System.out.println("\t\t*******\n\n");
		
		System.out.println("\t\t                     *");
		System.out.println("\t\t                   *****");
		System.out.println("\t\t               *************");
		System.out.println("\t\t         *************************");
		System.out.println("\t\t    **********************************");
		System.out.println("\t\t***** Happy fuckin christmas bitches *****");
		System.out.println("\t\t    **********************************");
		System.out.println("\t\t         **************************");
		System.out.println("\t\t               **************");
		System.out.println("\t\t                   *****");
		System.out.println("\t\t                     *");
		
		System.out.println("First Witch\tWhen shall we three meet again?");
		System.out.println("\t\tIn thunder, lightning, or in rain?");
		System.out.println("Second Witch\tWhen the hurlyburly's done,");
		System.out.println("\t\tWhen the battle's lost and won.");
		System.out.println("Third Witch\tThat will be ere the set of sun.");
		
		String fun;
		fun = "\nTwo's complement is not a complicated scheme and is not well served by anything lengthly. Therefore, after this introduction, which explains what two's complement is and how to use it, there are mostly examples.\n"
				+ "\n"
				+ "Two's complement is the way every computer I know of chooses to represent integers. To get the two's complement negative notation of an integer, you write out the number in binary. You then invert the digits, and add one to the result.\n"
				+ "\n"
				+ "Suppose we're working with 8 bit quantities (for simplicity's sake) and suppose we want to find how -28 would be expressed in two's complement notation. First we write out 28 in binary form.\n\n";
		System.out.printf(fun);
		System.out.println(fun.length());
		System.out.println(fun.charAt(1));
		System.out.println(fun.charAt(2));
		System.out.println(fun.toUpperCase());
		System.out.println(fun.replace("a", "%"));
		System.out.println(fun.indexOf("n"));
		System.out.println(fun.lastIndexOf("n"));
		
		int length;
		length = 6;
		System.out.println(length*length);
		
		double radius, pi, area;
		radius = 6;
		pi = 3.142;
		area = radius * pi;
		System.out.println(area);
		
		int number1, number2;
		number1 = 3;
		number2 = 10;
		
		if (number1 >= number2) {
			System.out.println(number1); 
		} else {
			System.out.println(number2);
		}
	
		
		
		
	}

}

