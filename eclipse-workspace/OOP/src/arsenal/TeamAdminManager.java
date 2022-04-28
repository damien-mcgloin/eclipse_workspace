package arsenal;

public class TeamAdminManager {

	public static void main(String[] args) {
		
		Footballer f1 = new Footballer();
		f1.setFirstName("Leo");
		f1.setLastName("Messi");
		f1.setEmployeeNumber(1134);
		f1.setSquadNumber(32);
		
		System.out.println(f1.getFirstName() +" " +f1.getSquadNumber());
		
		Footballer f2 = new Footballer("Gareth", "Bale", 10101, 9);
		System.out.println(f2.getLastName());
		
		Footballer f3 = new Footballer("Roy", "Keane", 82828);
		System.out.println(f3.getSquadNumber());
		
		f1.displayDetails();
		
		System.out.println(f3.toString());
		
	}

}
