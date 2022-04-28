package practical;

/**
 * 
 * @author damienmcgloin
 *
 */
public class SimpsonsCharacter1 {
	
	private String name;
	
	private String catchPhrase;
	
	/**
	 * Sets the name of the character
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the catchPhrase
	 */
	public String getCatchPhrase() {
		return catchPhrase;
	}

	/**
	 * @param catchPhrase the catchPhrase to set
	 */
	public void setCatchPhrase(String catchPhrase) {
		this.catchPhrase = catchPhrase;
	}
	
	public void sayCatchPhrase() {
		System.out.println(this.name +" says "+this.catchPhrase);
	}

}
