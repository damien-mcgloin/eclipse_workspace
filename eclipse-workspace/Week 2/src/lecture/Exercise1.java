package lecture;

/**
 * This is the solution to an exercise...
 * @author damienmcgloin
 *
 */
public class Exercise1 {

	/**
	 * Start point for the exercise...
	 * @param args
	 */
	public static void main(String[] args) {
		
		// declare vars – using 4 values (ages) here
		int age1, age2, age3, age4, averageAge;
		
		 // assign values
		age1 = 9;
		age2 = 6;
		age3 = 17;
		age4 = 22;

		 // work out average
		averageAge = (age1 + age2 + age3 + age4) / 4;

		 System.out.println("Average is " + averageAge);

		 // check if each one is above the average
		if (age1 > averageAge) {
		System.out.println(age1 + " is above the average !");
		}

		 if (age2 > averageAge) {
		System.out.println(age2 + " is above the average !");
		}

		 if (age3 > averageAge) {
		System.out.println(age3 + " is above the average !");
		}

		 if (age4 > averageAge) {
		System.out.println(age4 + " is above the average !");
		}

	}

}
