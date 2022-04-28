package arrayexamples;

public class Vehicle {
	
	private String name;
	private String powerType;
	
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
	 * @return the powerType
	 */
	public String getPowerType() {
		return powerType;
	}
	/**
	 * @param powerType the powerType to set
	 */
	public void setPowerType(String powerType) {
		this.powerType = powerType;
	}
	@Override
	public String toString() {
		return "Vehicle [name=" + name + ", powerType=" + powerType + "]";
	}
	

}
