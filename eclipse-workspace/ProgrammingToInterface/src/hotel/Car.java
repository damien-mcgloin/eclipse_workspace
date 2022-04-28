package hotel;

public class Car implements IVehicle {

	private int mileage;
	
	@Override
	public void start() {
		System.out.println("Starting car");

	}

	/**
	 * @return the mileage
	 */
	public int getMileage() {
		return mileage;
	}

	/**
	 * @param mileage the mileage to set
	 */
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

}
