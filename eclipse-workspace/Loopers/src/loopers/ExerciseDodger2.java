/**
 * 
 */
package loopers;

/**
 * @author damienmcgloin
 *
 */
public class ExerciseDodger2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int reps;
		reps = 0;

		while (reps < 10) {
			reps++;

			if (reps == 3 || reps == 4) {
				System.out.println("Miss a few");
				continue;
			}

				System.out.println("Yes.. " + reps);
		}

	}

}
