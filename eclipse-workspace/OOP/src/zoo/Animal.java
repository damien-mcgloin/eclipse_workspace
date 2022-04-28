/**
 * 
 */
package zoo;

/**
 * @author damienmcgloin
 *
 */
public class Animal {

	private String name;
	private String noise;
	private String eyeColor;
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the noise
	 */
	public String getNoise() {
		return noise;
	}
	/**
	 * @param noise the noise to set
	 */
	public void setNoise(String noise) {
		this.noise = noise;
	}
	/**
	 * @return the eyeColor
	 */
	public String getEyeColor() {
		return eyeColor;
	}
	/**
	 * @param eyeColor the eyeColor to set
	 */
	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}
	
	public void makeNoise() {
		System.out.println(this.name+ " makes a "+this.noise);
	}

}
