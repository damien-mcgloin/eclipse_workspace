/**
 * 
 */
package practical3;

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

	/**
	 * @param make
	 * @param model
	 * @param horsePower
	 */
	public FamilySaloon(String make, String model, int horsePower, boolean metallicPaint) {
		super(make, model, horsePower);
		this.metallicPaint = metallicPaint;
	}

	/**
	 * @return the metallicPaint
	 */
	public boolean isMetallicPaint() {
		return metallicPaint;
	}

	/**
	 * @param metallicPaint the metallicPaint to set
	 */
	public void setMetallicPaint(boolean metallicPaint) {
		this.metallicPaint = metallicPaint;
	}

	@Override
	public void displayAll() {
		System.out.println("Family Saloon");
		super.displayAll();
		System.out.println("Metalic paint : "+this.metallicPaint);
	}
	
	

}
