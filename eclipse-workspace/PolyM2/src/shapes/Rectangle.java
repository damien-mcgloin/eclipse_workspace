package shapes;

/**
 * @author damienmcgloin
 *
 */
public class Rectangle extends Shape {

	private int width;
	private int height;
	/**
	 * @return the width
	 */
	public int getWidth() {
		return width;
	}
	/**
	 * @param width the width to set
	 */
	public void setWidth(int width) {
		this.width = width;
	}
	/**
	 * @return the height
	 */
	public int getHeight() {
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
		int heightArea = this.height*this.width;
		System.out.println("The area of the rectangle is "+heightArea);
	}
	
	
	
}
