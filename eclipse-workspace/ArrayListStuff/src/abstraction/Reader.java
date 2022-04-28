package abstraction;

public class Reader extends Employee {

	private String research;
	
	public Reader() {
		
	}
	
	public Reader(String firstName, String lastName, String research) {
		super(firstName, lastName);
		this.research = research;
	}
	
	/**
	 * @return the research
	 */
	public String getResearch() {
		return research;
	}

	/**
	 * @param research the research to set
	 */
	public void setResearch(String research) {
		this.research = research;
	}

	public Reader(String firstName, String lastName) {
		super(firstName, lastName);
		
	}

	@Override
	public void calculateSalary(double hours, double rate) {
		System.out.println("Lecturer salary : "+(hours*rate*10));	
	}

}
