/**
 * 
 */
package loopers;

/**
 * @author damienmcgloin
 *
 */

//import java.util.Scanner;

public class Practical4Part31 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*Scanner scanner = new Scanner(System.in);
		
		String userName;
		userName = scanner.nextLine();
		
		for (int loop = 1; loop<11; loop++) {
			System.out.println(userName);
		}
		scanner.close();*/
		
		/*int num = 11;
		
		while (num>1) {
			num--;
			System.out.print(num+",");
		} 
		System.out.print("Liftoff!");
		
		/*for (; num>0; num--) {
			System.out.print(num+",");
			}
		System.out.print("Liftoff!");*/
		
		for (int num = 1000; num>=0; num--) {
			if (num == 333){
			System.out.println("Launch aborted!");
			break;
			}
			System.out.println(num);
		}
		
		}

	}


