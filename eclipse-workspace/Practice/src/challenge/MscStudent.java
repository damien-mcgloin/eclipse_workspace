/**
 * 
 */
package challenge;

/**
 * @author damienmcgloin
 *
 */
public class MscStudent extends Student {

	private int programming;
	private int db;
	private int computingFoundations;
	private int softwareEngineering;
	private int web;
	
	private String classification = "Not available";
	
	public MscStudent() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param studentNumber
	 * @param firstName
	 * @param lastName
	 */
	public MscStudent(int studentNumber, String firstName, String lastName, int programming, int db,
			int computingFoundations, int softwareEngineering, int web) {
		super(studentNumber, firstName, lastName);
		this.programming = programming;
		this.db = db;
		this.computingFoundations = computingFoundations;
		this.softwareEngineering = softwareEngineering;
		this.web = web;
	}

	/**
	 * @return the programming
	 */
	public int getProgramming() {
		return programming;
	}

	/**
	 * @param programming the programming to set
	 */
	public void setProgramming(int programming) {
		this.programming = programming;
	}

	/**
	 * @return the db
	 */
	public int getDb() {
		return db;
	}

	/**
	 * @param db the db to set
	 */
	public void setDb(int db) {
		this.db = db;
	}

	/**
	 * @return the computingFoundations
	 */
	public int getComputingFoundations() {
		return computingFoundations;
	}

	/**
	 * @param computingFoundations the computingFoundations to set
	 */
	public void setComputingFoundations(int computingFoundations) {
		this.computingFoundations = computingFoundations;
	}

	/**
	 * @return the softwareEngineering
	 */
	public int getSoftwareEngineering() {
		return softwareEngineering;
	}

	/**
	 * @param softwareEngineering the softwareEngineering to set
	 */
	public void setSoftwareEngineering(int softwareEngineering) {
		this.softwareEngineering = softwareEngineering;
	}

	/**
	 * @return the web
	 */
	public int getWeb() {
		return web;
	}

	/**
	 * @param web the web to set
	 */
	public void setWeb(int web) {
		this.web = web;
	}

	/**
	 * @return the classification
	 */
	public String getClassification() {
		return classification;
	}

	/**
	 * @param classification the classification to set
	 */
	public void setClassification(String classification) {
		this.classification = classification;
	}
	
	public void displayStudentRecord() {
		System.out.println("____________________________________________\n");
		System.out.println("Student no. : "+this.getStudentNumber());
		System.out.println("First name : "+this.getFirstName());
		System.out.println("Last name : "+this.getLastName());
		System.out.println("Module results");
		System.out.println("Program : "+this.programming);
		System.out.println("Comp found : "+this.computingFoundations);
		System.out.println("DBs : "+this.db);
		System.out.println("Web : "+this.web);
		System.out.println("Software E : "+this.softwareEngineering);
		System.out.println("Average : "+this.calculateAverage());
		System.out.println("Classification : "+this.classification);
		System.out.println("______________________________________\n");
		
	}
	
	public void displayStudentClassification() {
		System.out.println("____________________________________________\n");
		System.out.println("Student no. : "+this.getStudentNumber());
		System.out.println("First name : "+this.getFirstName());
		System.out.println("Last name : "+this.getLastName());
		System.out.println("Average : "+this.calculateAverage());
		System.out.println("Classification : "+this.classification);
		System.out.println("______________________________________\n");
	}
	
	private int calculateAverage() {
		int total = this.programming * 2 + this.computingFoundations + this.db + this.softwareEngineering + this.web;
		return total/6;
	}
	
	public void classifyStudent() {
		int taughtAverage = calculateAverage();
		
		if (taughtAverage<0 || taughtAverage>100) {
			this.classification = "Error";
		} else if (taughtAverage>=50 && taughtAverage<=59) {
			this.classification = "Pass";
		} else if (taughtAverage>=60 && taughtAverage<=69) {
			this.classification = "Merit";
		} else if (taughtAverage>=70 && taughtAverage<=100){
			this.classification = "Distinction";
		} else {
			this.classification = "Fail";
		}
	}

}
