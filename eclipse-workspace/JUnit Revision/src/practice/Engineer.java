/**
 * 
 */
package practice;

/**
 * @author damienmcgloin
 *
 */
public class Engineer extends Employee {

	private String discipline;
	
	/**
	 * Default constructor
	 */
	public Engineer() {

	}

	/**
	 * Constructor with args
	 * @param name
	 * @param age
	 * @param height
	 * @throws IllegalArgumentException
	 */
	public Engineer(String name, int age, int height, String discipline) throws IllegalArgumentException {
		super(name, age, height);
		this.setDiscipline(discipline);
	}

	public String getDiscipline() {
		return discipline;
	}

	public void setDiscipline(String discipline) {
		
		this.discipline = discipline;
	}

}
