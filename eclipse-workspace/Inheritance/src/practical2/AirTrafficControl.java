package practical2;

public class AirTrafficControl {

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
		
		for(int loop = 0; loop<flights.length; loop++) {
			System.out.println(flights[loop]);
		}
		
		longestFlight(flights);
		dublinFlights(flights);
		
	}
	
	public static void longestFlight(Flight[] flights) {
	
		double max = flights[0].getDuration();
		
		for (int loop = 0; loop<flights.length; loop++) {
			if(flights[loop].getDuration()>max) {
				max=flights[loop].getDuration();
			}
		}
		
		System.out.println("The longest duration is : "+max);
		
	}
	
	public static void dublinFlights(Flight[] flights) {
		
		System.out.println("The flights to Dublin : ");
		
		for (Flight flight : flights) {
			if (flight.getDestination().equalsIgnoreCase("Dublin")) {
				System.out.println(flight.getFlightNumber());
			}
		}
	}

}
