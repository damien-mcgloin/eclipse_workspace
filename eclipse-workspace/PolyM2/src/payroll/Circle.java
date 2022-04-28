package payroll;

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
		System.out.println("The area of the Circle is "+(Math.PI*(this.radius*this.radius)));
	}

}
