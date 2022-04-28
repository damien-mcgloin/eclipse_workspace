package challenge;

public class MyRectangle implements IMyShape {

	private double length;
	private double breadth;
	private String shapeName;
	
	public MyRectangle() {
		
	}
	
	public MyRectangle(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
		this.shapeName = "Rectangle";
	}
	
	@Override
	public double calculatePerimeter() {
		double perimeter = 2 * (length + breadth);
		return perimeter;
	}

	@Override
	public double calculateArea() {
		double area = length * breadth;
		return area;
	}

	@Override
	public String getShapeName() {
		return shapeName;
	}

	/**
	 * @return the length
	 */
	public double getLength() {
		return length;
	}

	/**
	 * @param length the length to set
	 */
	public void setLength(double length) {
		this.length = length;
	}

	/**
	 * @return the breadth
	 */
	public double getBreadth() {
		return breadth;
	}

	/**
	 * @param breadth the breadth to set
	 */
	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}

}
