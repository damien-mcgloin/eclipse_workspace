package graduation;

public class MscStudent extends Student {

	private int program;
	private int compFound;
	private int dbs;
	private int web;
	private int softwareE;
	private String classification = "Not Available";

	public MscStudent() {
		// TODO Auto-generated constructor stub
	}

	public MscStudent(String studentNum, String firstName, String lastName, int program, int compFound, int dbs,
			int web, int softwareE) {
		super(studentNum, firstName, lastName);
		this.program = program;
		this.compFound = compFound;
		this.dbs = dbs;
		this.web = web;
		this.softwareE = softwareE;
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
	 * @return the softwareE
	 */
	public int getSoftwareE() {
		return softwareE;
	}

	/**
	 * @param softwareE the softwareE to set
	 */
	public void setSoftwareE(int softwareE) {
		this.softwareE = softwareE;
	}
	
	/**
	 * @return the classification
	 */
	public String getClassification() {
		return this.classification;
	}


	public void displayStudentClassification() {
		System.out.println("Student no. : " + this.getStudentNum());
		System.out.println("First name : " + this.getStudentNum());
		System.out.println("Last name : " + this.getLastName());
		System.out.println("Module Results");
		System.out.println("Program : " + this.program);
		System.out.println("Comp Found : " + this.compFound);
		System.out.println("DBS : " + this.dbs);
		System.out.println("Web : " + this.web);
		System.out.println("Software E : " + this.softwareE);
		System.out.println("Average : "+averageGrade());
		System.out.println("Classification : "+this.classification);
	}

	public int averageGrade() {
		int total = (this.program * 2) + this.compFound + this.dbs + this.softwareE + this.web;
		int average = total / 6;
		
		return average;
	}
	
	public void classification() {
		
		int average = averageGrade();
		
		if(average<0 || average>100) {
			this.classification = "Error : Invalid Result";
		} else if(average>=70 && average<=100) {
			this.classification = "Distinction";
		} else if(average>=60 && average<=69) {
			this.classification = "Merit";
		} else if(average>=50 && average<=59) {
			this.classification = "Pass";
		} else {
			this.classification = "Fail";
		}
		
	}

}
