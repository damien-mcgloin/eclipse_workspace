/**
 * 
 */
package exceptional;

/**
 * @author damienmcgloin
 *
 */
public class ClassExercise2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] nums = { 2, 4, 6, 8 };

		for (int loop = 0; loop < 4; loop++) {
			System.out.println(nums[loop]);
		}
		doSomething();
		System.out.println("I am done");

	}

	public static void doSomething() {
		System.out.println("Hello there! dd");
	}

}
