package challenge;

public class MySquare implements IMyShape {

	/**
	 * The length of one side
	 */
	private double length;
	
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
	 * The shape name
	 */
	private String shapeName;
	
	
	/**
	 * Default constructor
	 */
	public MySquare(){
	}
	
	/**
	 * Constuctor with parameter
	 * @param length of one side
	 */
	public MySquare(double length){
		this.length = length;
		this.shapeName = "Square";
	}
	
	/**
	 * Calculates the area of the circle 
	 * @return the area
	 */
	public double calculateArea() {
		double area = length * length;
		return area;
	}

	/**
	 * Calculates the perimeter of the circle 
	 * @return the perimeter
	 */
	public double calculatePerimeter() {
		double perimeter = 4 * length;
		return perimeter;
	}
	
	/**
	 * Gets the name of the shape
	 * @return the name of the shape
	 */
	public String getShapeName() {
		return shapeName;
	}
	
}
