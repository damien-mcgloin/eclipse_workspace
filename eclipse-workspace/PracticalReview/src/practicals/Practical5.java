/**
 * 
 */
package practicals;

/**
 * @author damienmcgloin
 *
 */

import java.util.Scanner;

public class Practical5 {

	/**
	 * @param args
	 */

	public static void vowelCounter(String name) {

		int vowelA = 0;
		int vowelE = 0;
		int vowelI = 0;
		int vowelO = 0;
		int vowelU = 0;

		System.out.println("Enter your name...");
		Scanner scanner = new Scanner(System.in);

		name = scanner.nextLine();
		char[] userLetter = new char[name.length()];

		for (int loop = 0; loop < name.length(); loop++) {
			userLetter[loop] = name.charAt(loop);
			switch (userLetter[loop]) {
			case 'a':
			case 'A':
				vowelA++;
				break;
			case 'e':
			case 'E':
				vowelE++;
				break;
			case 'i':
			case 'I':
				vowelI++;
				break;
			case 'o':
			case 'O':
				vowelO++;
				break;
			case 'u':
			case 'U':
				vowelU++;
				break;
			default:
			}
		}

		System.out.println("The number of A's is : " + vowelA);
		System.out.println("The number of E's is : " + vowelE);
		System.out.println("The number of I's is : " + vowelI);
		System.out.println("The number of O's is : " + vowelO);
		System.out.println("The number of U's is : " + vowelU);
		
		scanner.close();

	}
	
	public static void evenNums() {
		
		int[] evenArray = new int[50];
		
		//int total = 0;
		int nextFreeElement = 0;
		
		for(int loop = 1; loop<=100; loop++) {
			if(loop%2 == 0) {
				loop = evenArray[nextFreeElement];
			}
			System.out.println(evenArray[nextFreeElement]);
		}
		
	}

	public static void averageAssign(int[] assign1, int[] assign2) {
		
		double aver1, aver2, totalAver;
		
		aver1 = (double)totalAssign(assign1)/assign1.length;
		aver2 = (double)totalAssign(assign2)/assign2.length;
		
		System.out.println("The average of assign1 is : "+aver1);
		System.out.println("The average of assign2 is : "+aver2);
		
		totalAver = (aver1+aver2)/2;
		System.out.println("The average of both assignments is : "+totalAver);
		
		if(aver1>aver2) {
			System.out.println("The average of assign1 is higher");
		} else if (aver1<aver2) {
			System.out.println("The average of assign2 is higher");
		} else {
			System.out.println("The average of each assignment is the same");
		}
		
	}
	
	public static int totalAssign(int[] num) {
		
		int total = 0;
		
		for(int loop = 0; loop<num.length; loop++) {
			total+=num[loop];
		}
		
		return total;
		
	}
	
	public static void quote() {
		
		String[] quoteArray = { "Continuous", "effort", "not", "strength", "nor", "intelligence", "is",
				"the", "key", "for", "unlocking", "our", "potential" };
		
		//char[] userLetter;
		
		for(int loop = 0; loop<quoteArray.length; loop++) {
			System.out.println(quoteArray[loop]);
		}
		
	}
	
	public static void arrayExample() {
		
		int[][] example = new int [4][4];
		int num = 0;
		int total = 0;
		
		for(int outer = 0; outer<example.length; outer++) {
			System.out.println();
			for(int inner = 0; inner<example.length; inner++) {
				num+=2;
				total+=num;
				example[outer][inner]+=num;
				System.out.print(example[outer][inner]+" ");
			}
		}
		
		int average = (example.length*example.length);
		System.out.println("\nThe total is : "+total);
		System.out.println("The average is : "+total/average);
		
	}
	
	public static void main(String[] args) {

		//vowelCounter("Damien");
		//evenNums();
		
		//int assign1[] = { 24, 42, 29, 66, 77 };
		//int assign2[] = { 79, 68, 31, 22, 42 };
		//averageAssign(assign1, assign2);
		
		quote();
		//arrayExample();

	}

}
