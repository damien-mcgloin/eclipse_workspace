/**
 * 
 */
package shapes;

/**
 * @author damienmcgloin
 *
 */
public class Circle extends Shape {
	
	private double radius;

	/**
	 * @return the radius
	 */
	public double getRadius() {
		return radius;
	}

	/**
	 * @param radius the radius to set
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public void area() {
		double circleArea;
		circleArea = (this.radius*this.radius)*Math.PI;
		System.out.println("The area of the circle is "+circleArea);
	}
	
	

}
