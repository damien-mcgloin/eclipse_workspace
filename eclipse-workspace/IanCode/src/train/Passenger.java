package train;

/**
 * 
 * @author Damien McGloin 40000631
 *
 */
public class Passenger {

	private int ID;
	private String firstName;
	private String surname;
	private PassengerClass passengerClass;

	/**
	 * Default passenger constructor
	 */
	public Passenger() {

	}

	/**
	 * Constructor for passenger with name, ID and class
	 * 
	 * @param ID
	 * @param firstName
	 * @param surname
	 * @param passengerClass
	 */
	public Passenger(int ID, String firstName, String surname, PassengerClass passengerClass) {
		super();
		this.ID = ID;
		this.firstName = firstName;
		this.surname = surname;
		this.passengerClass = passengerClass;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public PassengerClass getPassengerClass() {
		return passengerClass;
	}

	public void setPassengerClass(PassengerClass passengerClass) {
		this.passengerClass = passengerClass;
	}

	/**
	 * Creates and returns a simple string of passenger details
	 */
	@Override
	public String toString() {
		return "Passenger [ID=" + ID + ", firstName=" + firstName + ", surname=" + surname + ", passengerClass="
				+ passengerClass + "]";
	}

}
