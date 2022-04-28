/**
 * 
 */
package p240000631;

/**
 * @author damienmcgloin
 *
 */
public class F1 extends Car {

	private double area;

	public F1() {

	}
	
	/**
	 * 
	 */
	public F1(String make, String model, int horsePower, double area) {
		super(make, model, horsePower);
		this.area = area;
	}

	/**
	 * @return the area
	 */
	public double getArea() {
		return area;
	}

	/**
	 * @param area the area to set
	 */
	public void setArea(double area) {
		this.area = area;
	}
	
	@Override
	public void displayAll() {
		System.out.println("F1");
		super.displayAll();
		System.out.println("area : "+this.area);
	}
	
}
