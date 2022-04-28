package arrayexamples;

public class Car {
	
	private int numberOfWheels;

	/**
	 * @return the numberOfWheels
	 */
	public int getNumberOfWheels() {
		return numberOfWheels;
	}

	/**
	 * @param numberOfWheels the numberOfWheels to set
	 */
	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}

	@Override
	public String toString() {
		return "Car [numberOfWheels=" + numberOfWheels + "]";
	}
	
	

}
