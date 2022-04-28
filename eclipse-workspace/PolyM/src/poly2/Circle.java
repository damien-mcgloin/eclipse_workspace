/**
 * 
 */
package poly2;

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
		circleArea = Math.PI*(this.radius*this.radius);
		
		System.out.println("Circle area : "+circleArea);
	}

}
