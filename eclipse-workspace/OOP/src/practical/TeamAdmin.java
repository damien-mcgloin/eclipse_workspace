package practical;

/**
 * 
 * @author damienmcgloin
 *
 */
public class TeamAdmin {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Footballer f1 = new Footballer();
		System.out.println(f1.getLastName());
		
		f1.setFirstName("Gareth");
		f1.setLastName("Bale");
		f1.setEmployeeNumber(282882);
		f1.setSquadNumber(7);
		System.out.println(f1.toString());
		
		System.out.println(f1.getLastName());
		
		Footballer f2 = new Footballer("George", "Best", 8, 999898);
		System.out.println(f2.getLastName());
		System.out.println(f2.toString());

	}

}
