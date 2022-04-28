package polymorph;

public class Dog extends Animal {
	
	private int licenseNumber;

	/**
	 * @return the licenseNumber
	 */
	public int getLicenseNumber() {
		return licenseNumber;
	}

	/**
	 * @param licenseNumber the licenseNumber to set
	 */
	public void setLicenseNumber(int licenseNumber) {
		this.licenseNumber = licenseNumber;
	}
	
	@Override
	public void makeNoise() {
		System.out.println("Dog makes a noise !");
	}

}
