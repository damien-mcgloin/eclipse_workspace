/**
 * 
 */
package scores2;

/**
 * @author damienmcgloin
 *
 */
public class MScStudent extends Student {

	private int program;
	private int compFound;
	private int dbs;
	private int web;
	private int softwareEng;

	private String classification = "Not available";

	/**
	 * 
	 */
	public MScStudent() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param studentNumber
	 * @param firstName
	 * @param lastName
	 */
	public MScStudent(int studentNumber, String firstName, String lastName, int program, int compFound, int dbs,
			int web, int softwareEng) {
		super(studentNumber, firstName, lastName);
		this.program = program;
		this.compFound = compFound;
		this.dbs = dbs;
		this.web = web;
		this.softwareEng = softwareEng;
	}

	/**
	 * @return the program
	 */
	public int getProgram() {
		return program;
	}

	/**
	 * @param program the program to set
	 */
	public void setProgram(int program) {
		this.program = program;
	}

	/**
	 * @return the compFound
	 */
	public int getCompFound() {
		return compFound;
	}

	/**
	 * @param compFound the compFound to set
	 */
	public void setCompFound(int compFound) {
		this.compFound = compFound;
	}

	/**
	 * @return the dbs
	 */
	public int getDbs() {
		return dbs;
	}

	/**
	 * @param dbs the dbs to set
	 */
	public void setDbs(int dbs) {
		this.dbs = dbs;
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
	 * @return the softwareEng
	 */
	public int getSoftwareEng() {
		return softwareEng;
	}

	/**
	 * @param softwareEng the softwareEng to set
	 */
	public void setSoftwareEng(int softwareEng) {
		this.softwareEng = softwareEng;
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

	public int calculateAverage() {
		int total = program * 2 + compFound + dbs + web + softwareEng;
		return total / 6;
	}

	public void classifyStudents() {
		int studentAverage = calculateAverage();
		if (studentAverage >= 70 && studentAverage <= 100) {
			this.classification = "distinction";
		} else if (studentAverage >= 60 && studentAverage <= 69) {
			this.classification = "commendation";
		} else if (studentAverage >= 50 && studentAverage <= 59) {
			this.classification = "pass";
		} else if (studentAverage >= 0 && studentAverage <= 49) {
			this.classification = "fail";
		} else {
			this.classification = "error";
		}
	}
	
	public void displayTaughtAverage() {
		System.out.println("___________________________________");
		System.out.println("Student number : "+this.getStudentNumber());
		System.out.println("First name : "+this.getFirstName());
		System.out.println("Last name : "+this.getLastName());
		System.out.println("Module results");
		System.out.println("Program : "+this.program);
		System.out.println("Comp Found : "+this.compFound);
		System.out.println("DBs : "+this.dbs);
		System.out.println("Web : "+this.web);
		System.out.println("Software E : "+this.softwareEng);
		System.out.println("Average : "+this.calculateAverage());
		System.out.println("Classification : "+this.classification);
		System.out.println("___________________________________");
	}
	
	public void displayClassifications() {
		System.out.println("___________________________________");
		System.out.println("Student number : "+this.getStudentNumber());
		System.out.println("First name : "+this.getFirstName());
		System.out.println("Last name : "+this.getLastName());
		System.out.println("Average : "+this.calculateAverage());
		System.out.println("Classification : "+this.classification);
		System.out.println("___________________________________");
	}

}
