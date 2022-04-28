package polymorph;

public class Dog extends Animal {
	
	private int licenseNumber;
	
	

	public int getLicenseNumber() {
		return licenseNumber;
	}

	public void setLicenseNumber(int licenseNumber) {
		this.licenseNumber = licenseNumber;
	}
	
	@Override
	public void makeNoise() {
		System.out.println("Dog makes a bark !");
	}

}
