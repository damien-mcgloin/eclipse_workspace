/**
 * 
 */
package arrays;

/**
 * @author damienmcgloin
 *
 */
public class Practical6Part1Q1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		final double rate = 11.50;
		
		int[] salaryWeek = { 8, 7, 9, 7, 4, 6 };
		
		System.out.println("Monday : "+salaryWeek[0]);
		System.out.println("Tuesday : "+salaryWeek[1]);
		System.out.println("Wednesday : "+salaryWeek[2]);
		System.out.println("Thursday : "+salaryWeek[3]);
		System.out.println("Friday : "+salaryWeek[4]);
		System.out.println("Friday : "+salaryWeek[5]);
		
		int total = 0;
		
		for (int loop=0; loop<salaryWeek.length; loop++) {
			total+=salaryWeek[loop];
		}
		System.out.println("The total hours are : "+total);
		
		double average = rate*total;
		System.out.println("The weekly salary is : "+average);

	}

}
