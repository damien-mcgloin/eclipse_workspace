/**
 * 
 */
package shapes;

/**
 * @author damienmcgloin
 *
 */
public class Triangle extends Shape {
	
	private double height;
	private double base;
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
	@Override
	public void area() {
		double triangleArea = (this.height*this.base/2);
		System.out.println("The shape of the triangle is "+triangleArea);
	}
	
	

}
