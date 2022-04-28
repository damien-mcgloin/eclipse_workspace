package polymorph;

public class Cat extends Animal {

	private int numOfFeet;

	/**
	 * @return the numOfFeet
	 */
	public int getNumOfFeet() {
		return numOfFeet;
	}

	/**
	 * @param numOfFeet the numOfFeet to set
	 */
	public void setNumOfFeet(int numOfFeet) {
		this.numOfFeet = numOfFeet;
	}

	@Override
	public void makeNoise() {
		System.out.println("Cat goes meeoooow!!!");
	}

	

}
