/**
 * 
 */
package practicals;

/**
 * @author damienmcgloin
 *
 */

import java.util.Scanner;
import java.util.Random;

public class Practice {

	/**
	 * @param args
	 */

	public static int factorialCounter(int num) {

		int factorial = num;

		for (int loop = num - 1; loop > 1; loop--) {
			factorial *= loop;
		}

		System.out.println(num + "! = " + factorial);

		return num;

	}

	public static void randomNum() {

		int randomInt;

		Random random = new Random();

		for (int loop = 1; loop <= 100; loop++) {
			randomInt = random.nextInt(100);
			randomInt++;
			System.out.println("Generated : " + randomInt);
		}

	}

	public static void ageChecker() {

		Scanner scanner = new Scanner(System.in);

		int age = scanner.nextInt();

		if (age >= 18) {
			System.out.println("You can vote");
		} else {
			System.out.println("Screw you");
		}

		scanner.close();

	}

	public static void areaAndPerimChecker() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number to calculate area + perimeter");
		double userInput = scanner.nextDouble();

		double area = userInput * userInput;
		double perimeter = userInput * 4;

		System.out.println("area is : " + area);

		System.out.println("perimeter is : " + perimeter);

		scanner.close();

	}

	public static void squareroot() {

		Scanner scanner = new Scanner(System.in);

		int userInput = scanner.nextInt();

		double root = Math.sqrt(userInput);

		System.out.println("the square root is : " + root);

		scanner.close();

	}

	public static int ageApplication(int age, boolean goodCreditHistory) {

		if (age >= 18 && goodCreditHistory == true) {
			System.out.println("You have been successful!");
		} else {
			System.out.println("Rejected... loser!");
		}

		return age;

	}

	public static void whileLoop() {

		Random random = new Random();
		Scanner scanner = new Scanner(System.in);

		int randomInt = random.nextInt(10);

		System.out.println("Guess the number...");
		int userInput = scanner.nextInt();

		while (userInput != randomInt) {
			userInput = scanner.nextInt();
		}

		System.out.println("Great job!");

		scanner.close();
	}

	public static void savingsInterest() {

		int initialSavings = 1000;
		int interest = initialSavings / 20;
		int year = 0;

		for (int loop = 1; loop <= 10; loop++) {
			initialSavings += interest;
			year++;
			System.out.println("year " + year + " : " + initialSavings);
		}

	}

	public static void encoder(String name) {

		name = "Damien McGloin";

		for (int loop = 0; loop < name.length(); loop++) {
			if (name.charAt(loop) != ' ') {
				System.out.print("*");
			} else {
				System.out.print(" ");
			}
		}

	}

	public static void factorial(int num) {

		int factorial = num;

		for (int loop = num - 1; loop > 1; loop--) {
			factorial *= loop;
		}
		System.out.println(factorial);

	}

	public static void example() {

		int loop = 88;
		while (loop < 93) {
			System.out.println(loop);
			loop++;
		}

	}

	public static void example2() {

		for (int loop = 1; loop < 20; loop++) {
			System.out.println(loop % 5);
		}

	}

	public static void example3() {

		for (int i = 25; i < 5; i--) {
			System.out.println(i);
		}

	}
	
	public static void example4() {
		
		int num = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number ...");
		
		num = sc.nextInt();
		num*=4;
		
		System.out.println("Output a : "+ ++num);
		
		System.out.println("Output b : "+ num--);
		
		System.out.println("Output c : "+ num);
		
		sc.close();
		
	}
	
	public static void yearChecker(int age) {
		
		int counter = 0;
		int yearTurn100 = 0;
		int year = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
		
			for(int loop = 1; loop<=100; loop++) {
			counter++;
			}
			
			counter-=age;
			yearTurn100=year+counter;
			System.out.println(yearTurn100);
				
	}
	
	public static void factorialAgain(int num) {
		
		int factorial = num;
		
		for(int loop = num-1; loop>1; loop--) {
			factorial*=loop;
		}
		
		System.out.println(factorial);
		
	}
	
	public static void arrayExample() {
		
		double[] shoes = { 11, 10, 10, 9, 11, 9, 11, 8.5 };
		double total = 0;
		
		for(int loop = 0; loop<shoes.length; loop++) {
			total+=shoes[loop];
			System.out.println(shoes[loop]);
		}
		
		System.out.printf("The average is %.2f",(total/shoes.length));
		
	}

	public static void ages() {
		
		int[] ageArray = { 86, 47, 30, 52, 43, 91, 21 };
		
		int total = 0;
		int max = ageArray[0];
		int min = ageArray[0];
		
		for(int loop = 0; loop<ageArray.length; loop++) {
			total+=ageArray[loop];
			if(max<ageArray[loop]) {
				max = ageArray[loop];
			}
			if(min>ageArray[loop]) {
				min = ageArray[loop];
			}
			System.out.print(ageArray[loop]+" ");
			
		}
		
		System.out.println("\nThe total is : "+total);
		System.out.println("The average is : "+total/ageArray.length);
		System.out.println("The oldest age is : "+max);
		System.out.println("The youngest age is : "+min);
		
	}
	
	public static void playAround() {
		
		int filler = 0;
		
		int[][] play = new int [3][4];
		
		for(int row = 0; row<play.length; row++) {
			System.out.println();
			for(int col = 0; col<play[row].length; col++) {
				filler+=2;
				play[row][col]=filler;
				System.out.print(play[row][col]+" ");
			}
		}
		
	}
	
	public static String coded(String name) {
		
		for(int loop = 0; loop<name.length(); loop++) {
			int[] charLetter = new int[name.charAt(loop)];
			charLetter[loop] = name.charAt(loop);
			System.out.print(charLetter[loop]+" ");
		}
		
		return name;
		
	}
	
	public static void uncoded(int[] asciiArray) {
		
		char[] charLetter = new char[asciiArray.length];

		for(int loop = 0; loop<asciiArray.length;loop++) {
			charLetter[loop] = (char) asciiArray [loop];
			System.out.print(charLetter[loop]);
		}
		
	}
	
	public static void main(String[] args) {

		// factorialCounter(4);
		// ageChecker();
		// randomNum();
		// areaAndPerimChecker();
		// squareroot();
		// ageApplication(15, true);
		// whileLoop();
		// savingsInterest();
		// encoder("Damien McGloin");
		// factorial(4);
		// example4();
		// yearChecker(30);
		// factorialAgain(4);
		// arrayExample();
		// ages();
		// playAround();
		
		int[] asciiArray = { 68, 97, 109, 105, 101, 110, 32, 77, 99, 71, 108, 111, 105, 110  };
		
		coded("Damien McGloin");
		System.out.println();
		uncoded(asciiArray);
		

	}

}
