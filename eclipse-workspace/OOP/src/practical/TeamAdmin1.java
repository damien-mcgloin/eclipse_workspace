package practical;

public class TeamAdmin1 {

	public static void main(String[] args) {
		
		Footballer1 f1 = new Footballer1();
		System.out.println(f1.getLastName());
		
		f1.setFirstName("Roy");
		f1.setLastName("Keane");
		f1.setSquadNumber(7);
		f1.setEmployeeNumber(29189);
		
		System.out.println(f1.getLastName());
		
		Footballer1 f2 = new Footballer1("George", "Best", 0, 435678);
		System.out.println(f2.getLastName());
		System.out.println(f2.toString());
		
		Footballer1 f3 = new Footballer1("Leo", "Messi", 56789);
		System.out.println(f3.toString());
		
	}

}
