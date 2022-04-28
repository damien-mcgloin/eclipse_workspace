package challenge;

public class MyTriangle implements IMyShape {
	
	private int width;
	
	public MyTriangle() {
		
	}
	
	public MyTriangle(int width) {
		this.width = width;
	}

	@Override
	public double calculatePerimeter() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getShapeName() {
		// TODO Auto-generated method stub
		return null;
	}

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

}
