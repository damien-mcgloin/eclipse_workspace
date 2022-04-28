package challenge;

public class Passenger extends Carriage {
	
	String firstName;
	int ID;
	PassengerClass passengerClass;
	String surname;
	
	public Passenger() {
		
	}
	
	public Passenger(int ID, String firstName, String surname, PassengerClass passengerClass) {
		this.ID = ID;
		this.firstName = firstName;
		this.surname = surname;
		this.passengerClass = passengerClass;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the iD
	 */
	public int getID() {
		return ID;
	}

	/**
	 * @param iD the iD to set
	 */
	public void setID(int iD) {
		ID = iD;
	}

	/**
	 * @return the passengerClass
	 */
	public PassengerClass getPassengerClass() {
		return passengerClass;
	}

	/**
	 * @param passengerClass the passengerClass to set
	 */
	public void setPassengerClass(PassengerClass passengerClass) {
		this.passengerClass = passengerClass;
	}

	/**
	 * @return the surname
	 */
	public String getSurname() {
		return surname;
	}

	/**
	 * @param surname the surname to set
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}

	@Override
	public String toString() {
		return "Passenger [firstName=" + firstName + ", ID=" + ID + ", passengerClass=" + passengerClass + ", surname="
				+ surname + "]";
	}

}
