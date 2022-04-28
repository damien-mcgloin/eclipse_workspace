/**
 * 
 */
package p240000631;

/**
 * @author damienmcgloin
 *
 */
public class FamilySaloon extends Car {

	private boolean metallicPaint;
	
	/**
	 * 
	 */
	public FamilySaloon() {
		// TODO Auto-generated constructor stub
	}
	
	public FamilySaloon(String make, String model, int horsePower, boolean metallicPaint) {
		super(make, model, horsePower);
		this.metallicPaint = metallicPaint;	
	}

	public boolean isMetallicPaint() {
		return metallicPaint;
	}

	public void setMetallicPaint(boolean metallicPaint) {
		this.metallicPaint = metallicPaint;
	}

	@Override
	public void displayAll() {
		System.out.println("Family Saloon");
		super.displayAll();
		System.out.println("metallic paint : "+this.metallicPaint);
	}
	
	

}
