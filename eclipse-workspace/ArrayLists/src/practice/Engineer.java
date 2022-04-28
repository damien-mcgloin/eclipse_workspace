package practice;

public class Engineer extends Person {
	
	private String discipline;
	
	public Engineer() {
		
	}
	
	public Engineer(String name, int height) {
		super(name, height);
	}

	/**
	 * @return the discipline
	 */
	public String getDiscipline() {
		return discipline;
	}

	/**
	 * @param discipline the discipline to set
	 */
	public void setDiscipline(String discipline) {
		this.discipline = discipline;
	}

}
