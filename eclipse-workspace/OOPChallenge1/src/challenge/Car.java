package challenge;

public class Car {
	
	private final int LOWER_HORSEPOWER = 0;
	private final int UPPER_HORSEPOWER = 1000;

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
	public void setHorsePower(int horsePower) {
		if(horsePower>=LOWER_HORSEPOWER && horsePower<=UPPER_HORSEPOWER) {
		this.horsePower = horsePower;
		} else {
			this.horsePower = -999;
		}
	}

	public void displayAll() {
		System.out.println("Make\t : " + this.make);
		System.out.println("Model\t : " + this.model);
		System.out.println("HorsePower\t : " + this.horsePower);
	}

}
