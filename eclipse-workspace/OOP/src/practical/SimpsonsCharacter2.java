package practical;

/**
 * 
 * @author damienmcgloin
 *
 */
public class SimpsonsCharacter2 {
	
	private String name;
	private String catchPhrase;
	
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
	
	/**
	 * This method will output characters catchphrase
	 */
	public void sayCatchPhrase() {
		
		System.out.println(this.name + " says "+this.catchPhrase);
		
	}
	
	

}
