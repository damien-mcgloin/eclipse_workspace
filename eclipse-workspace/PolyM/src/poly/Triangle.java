package poly;

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
	public void setBase(int base) {
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
	public void setHeight(int height) {
		this.height = height;
	}
	
	@Override
	public void area() {
		System.out.println("Area of triangle is "+(0.5*this.base*this.height));
	}
	
	

}
