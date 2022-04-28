package challenge;

public class Car {

	private final int LOW_HORSEPOWER = 0;
	private final int HIGH_HORSEPOWER = 1000;

	private String make;
	private String model;
	private int horsePower;

	public Car() {

	}

	public Car(String make, String model, int horsePower) {
		this.make = make;
		this.model = model;
		this.setHorsePower(horsePower);
	}

	/**
	 * @return the make
	 */
	public String getMake() {
		return make;
	}

	/**
	 * @param make the make to set
	 */
	public void setMake(String make) {
		this.make = make;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * @return the horsePower
	 */
	public int getHorsePower() {
		return horsePower;
	}

	/**
	 * @param horsePower the horsePower to set
	 */
	public void setHorsePower(int horsePower) throws IllegalArgumentException {
		if (horsePower >= LOW_HORSEPOWER && horsePower <= HIGH_HORSEPOWER) {
			this.horsePower = horsePower;
		} else {
			horsePower = -999;
		}
	}

	public void displayAll() {
		System.out.println("make : " + this.make);
		System.out.println("model : " + this.model);
		System.out.println("horsepower : " + this.horsePower);
	}

}
