/**
 * 
 */
package recap;

/**
 * @author damienmcgloin
 *
 */
public class Exercise {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// assign a value
		int age1, age2, age3, age4, total, average;
		age1 = 9;
		age2 = 6;
		age3 = 17;
		age4 = 22;
		
		total = (age1 + age2 + age3 + age4);
		average = (total/4);
		System.out.println(average);
		
		if (age1 > average) {
			System.out.println(age1 +" is greater than the average");
		}
		if (age2 > average) {
			System.out.println(age2 +" is greater than the average");
		}
		if (age3 > average) {
			System.out.println(age3 +" is greater than the average");
		}
		if (age4 > average) {
			System.out.println(age4 +" is greater than the average");
		} else {
			System.out.println("None of the ages are greater than the average");
		}

	}

}
