package arrayexamples;

public class Ship {
	
	private int tonnage;

	/**
	 * @return the tonnage
	 */
	public int getTonnage() {
		return tonnage;
	}

	/**
	 * @param tonnage the tonnage to set
	 */
	public void setTonnage(int tonnage) {
		this.tonnage = tonnage;
	}

	@Override
	public String toString() {
		return "Ship [tonnage=" + tonnage + "]";
	}
	
	

}
