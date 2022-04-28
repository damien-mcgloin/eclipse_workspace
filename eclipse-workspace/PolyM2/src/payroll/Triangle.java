package payroll;

public class Triangle extends Shape {
	
	private double base;
	private double height;
	/**
	 * @return the base
	 */
	public double getBase() {
		return base;
	}
	/**
	 * @param base the base to set
	 */
	public void setBase(double base) {
		this.base = base;
	}
	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}
	/**
	 * @param height the height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}
	
	@Override
	public void area() {
		System.out.println("The area of the Triangle is "+((this.base*this.height)/2));
	}

}
