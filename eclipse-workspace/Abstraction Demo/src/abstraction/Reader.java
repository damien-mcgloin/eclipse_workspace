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
	 * 
	 * @return
	 */
	public String getResearch() {
		return research;
	}

	/**
	 * 
	 * @param research
	 */
	public void setResearch(String research) {
		this.research = research;
	}

	@Override
	public void calculateSalary(double hours, double rate) {
		System.out.println("Reader salary : "+(hours*rate*10));
		
	}

}
