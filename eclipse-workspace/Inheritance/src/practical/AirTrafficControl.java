/**
 * 
 */
package practical;

/**
 * @author damienmcgloin
 *
 */
public class AirTrafficControl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Flight f1 = new Flight("ESY3214", "Belfast", "Amsterdam", 2.2);
		Flight f2 = new Flight("BA127", "London Heathrow", "Cape Town", 11.5);
		Flight f3 = new Flight("AE999", "Dublin", "New York JFK", 7.5);
		Flight f4 = new Flight("AA678", "Dublin", "Newwark", 8.5);
		Flight f5 = new Flight("AUS12", "Beijing", "Paris", 18.1);
		
		System.out.println(f1.toString());
		System.out.println(f2.toString());
		System.out.println(f3.toString());
		System.out.println(f4.toString());
		
		Flight[] flights = {f1, f2, f3, f4, f5};
		
		System.out.println(flights[0].getFlightNumber());
		
		double max = flights[0].getDuration();
		
		System.out.println("All flights going to Dublin...");
		
		for(int loop = 0; loop<flights.length; loop++) {
			//System.out.println(flights[loop].toString());
			//System.out.println(flights[loop].getDuration());
			if (flights[loop].getDuration() > max) {
				max = flights[loop].getDuration();
			}
			if (flights[loop].getDestination().equalsIgnoreCase("Dublin")) {
				System.out.println(flights[loop].getFlightNumber());
			}
		}
	
		System.out.println("The longest flight is : "+max);

	}
		
}
