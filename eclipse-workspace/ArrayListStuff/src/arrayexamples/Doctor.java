package arrayexamples;

public class Doctor extends StaffMember {

	private int ward;

	public Doctor() {

	}

	public Doctor(String firstName, String lastName, int ward) {
		super(firstName, lastName);
		this.ward = ward;
	}

	/**
	 * @return the ward
	 */
	public int getWard() {
		return ward;
	}

	/**
	 * @param ward the ward to set
	 */
	public void setWard(int ward) {
		this.ward = ward;
	}

	@Override
	public String toString() {
		return "Doctor [ward=" + ward + ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName() + "]";
	}

}
