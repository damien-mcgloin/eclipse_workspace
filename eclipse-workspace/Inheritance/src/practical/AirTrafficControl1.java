/**
 * 
 */
package practical;

/**
 * @author damienmcgloin
 *
 */
public class AirTrafficControl1 {

	/**
	 * 
	 */
	public AirTrafficControl1() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Flight1 f1 = new Flight1("ESY3214", "Belfast", "Amsterfam", 2.2);
		Flight1 f2 = new Flight1("BA127", "London Heathrow", "Cape Town", 11.5);
		Flight1 f3 = new Flight1("AE999", "Dublin", "New York JFK", 7.5);
		Flight1 f4 = new Flight1("AA678", "Dublin", "Newwark", 8.5);
		Flight1 f5 = new Flight1("AUS12", "Beijing", "Paris", 18.1);
		
		System.out.println(f1.toString());
		System.out.println(f2.toString());
		System.out.println(f3.toString());
		System.out.println(f4.toString());
		System.out.println(f5.toString());
		
		Flight1[] flights = {f1, f2, f3, f4, f5};
		
		double max = flights[0].getDuration();
		for(int loop = 0; loop<flights.length; loop++) {
			if(max<flights[loop].getDuration()) {
				max=flights[loop].getDuration();
			}
		}
		
		System.out.println("The flights going to Dublin are...");
		
		for(int loop = 0; loop<flights.length; loop++) {
			if(flights[loop].getDestination().equalsIgnoreCase("Dublin")) {
				System.out.println(flights[loop].getFlightNumber());
			}
		}
		
		System.out.println("The longest duration is : "+max);

	}

}
