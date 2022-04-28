package challenge;

public class MyCircle implements IMyShape {

	private double radius;
	private String shapeName;
	
	public MyCircle() {
		
	}
	
	public MyCircle(double radius) {
		this.radius = radius;
		this.shapeName = "Circle";
	}
	
	@Override
	public double calculatePerimeter() {
		double perimeter = 3.141 * 2 * radius;
		return perimeter;
	}

	@Override
	public double calculateArea() {
		double area = 3.141 * (radius * radius);
		return area;
	}

	@Override
	public String getShapeName() {
		// TODO Auto-generated method stub
		return shapeName;
	}

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

	/**
	 * @param shapeName the shapeName to set
	 */
	public void setShapeName(String shapeName) {
		this.shapeName = shapeName;
	}

	

}
