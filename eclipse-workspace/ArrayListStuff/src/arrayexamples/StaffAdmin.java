package arrayexamples;

public class StaffAdmin {

	public static void main(String[] args) {
		
		// create a Staff Member
		StaffMember staffMember = new StaffMember();
		staffMember.setFirstName("Damien");
		staffMember.setLastName("McGloin ");
		System.out.println(staffMember.toString());
		
		StaffMember sm2 = new StaffMember("Jimmy", "Jo");
		System.out.println(sm2.toString());
		
		Doctor doctor = new Doctor();
		doctor.setWard(4);
		doctor.setFirstName("Doctor");
		doctor.setLastName("Who");
		
		Programmer programmer = new Programmer();
		programmer.setLanguage("Java");
		programmer.setFirstName("Damien");
		programmer.setLastName("McGloin");
		
		System.out.println(programmer.toString());
		
		Programmer p2 = new Programmer("Damien", "McGloin", "Java");
		System.out.println(p2.toString());
		
		Doctor d2 = new Doctor("Dr", "Dre", 66623);
		System.out.println(d2.toString());


	}

}
