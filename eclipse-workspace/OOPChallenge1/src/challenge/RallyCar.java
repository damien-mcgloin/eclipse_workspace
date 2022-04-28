package challenge;

public class RallyCar extends Car {

	private double area;
	
	public RallyCar() {
		// TODO Auto-generated constructor stub
	}

	public RallyCar(String make, String model, int horsePower, double area) {
		super(make, model, horsePower);
		this.area = area;
	}

	/**
	 * @return the area
	 */
	public double getArea() {
		return area;
	}

	/**
	 * @param area the area to set
	 */
	public void setArea(double area) {
		this.area = area;
	}

	@Override
	public void displayAll() {
		System.out.println("Rally Car");
		super.displayAll();
		System.out.println("Area\t : "+this.area);
	}
	
	

}
