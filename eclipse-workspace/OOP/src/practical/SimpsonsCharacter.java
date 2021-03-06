package practical;

/**
 * 
 * @author damienmcgloin
 *
 */
public class SimpsonsCharacter {
	
	private String name;
	
	private String CatchPhrase;
	
	/**
	 * sets the name of the character
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Get the character's name
	 * @return
	 */
	public String getName() {
		return name;
	}
	
	public void setCatchPhrase(String CatchPhrase) {
		this.CatchPhrase = CatchPhrase;
	}
	
	public String getCatchPhrase() {
		return CatchPhrase;
	}
	
	/**
	 * this method will output character's catchphrase
	 */
	public void sayCatchPhrase() {
		System.out.println(this.name +" says " +this.CatchPhrase);
	}

}
