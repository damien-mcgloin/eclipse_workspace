/**
 * 
 */
package arrays;

/**
 * @author damienmcgloin
 *
 */

import java.util.Scanner;

public class PubQuiz {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("General knowledge quiz...");

		String[] jokeQuestions = { "Largest planet ? ", "Worst song ever ? ", "Capital of Peru ? ",
				"Roman god of War ? " };
		String[] jokeAnswers = { "Jupiter", "Castles in the Sky", "Lima", "Mars" };

		String userInput;
		String userContinue;

		for (int loop = 0; loop < jokeQuestions.length; loop++);
			
		{	
			System.out.println(jokeQuestions[0]);
			System.out.println(userInput = scanner.nextLine());
			if (userInput.equalsIgnoreCase(jokeAnswers[0])) {
				System.out.println("Great job!");
			} else {
				System.out.println("Too bad, next question");
			}
			System.out.println("Another question? (answer Y or N)");
			System.out.println(userContinue = scanner.nextLine());
			if (userContinue.equalsIgnoreCase("Y")) {
				System.out.println(jokeQuestions[1]);
				System.out.println(userInput = scanner.nextLine());
			} else {
				System.out.println("Thank you for playing");
			}
			if (userInput.equalsIgnoreCase(jokeAnswers[1])) {
				System.out.println("Great job!");
			} else {
				System.out.println("Too bad, next question");
			}
			if (userContinue.equalsIgnoreCase("Y")) {
				System.out.println(jokeQuestions[1]);
				System.out.println(userContinue = scanner.nextLine());
			} else {
				System.out.println("Thank you for playing");
			}
			System.out.println(jokeQuestions[2]);
			System.out.println(userInput = scanner.nextLine());
			if (userInput.equalsIgnoreCase(jokeAnswers[2])) {
				System.out.println("Great job!");
			} else {
				System.out.println("Too bad, next question");
			}
			if (userContinue.equalsIgnoreCase("Y")) {
				System.out.println(jokeQuestions[1]);
				System.out.println(userContinue = scanner.nextLine());
			} else {
				System.out.println("Thank you for playing");
			}
			System.out.println(jokeQuestions[3]);
			System.out.println(userInput = scanner.nextLine());
			if (userInput.equalsIgnoreCase(jokeAnswers[3])) {
				System.out.println("Great job!");
			} else {
				System.out.println("Too bad!");
			}
		}
		System.out.println("Thank you for playing");
		scanner.close();
	}

}
