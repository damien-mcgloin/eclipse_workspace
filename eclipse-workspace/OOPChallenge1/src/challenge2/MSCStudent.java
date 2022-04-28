package challenge2;

public class MSCStudent extends Student {

	private int program;
	private int compFound;
	private int dbs;
	private int web;
	private int softwareEng;
	private String classification = null;
	
	public MSCStudent() {
		// TODO Auto-generated constructor stub
	}

	public MSCStudent(int studentNum, String firstName, String lastName, int program, int compFound,
			int dbs, int web, int softwareEng) {
		super(studentNum, firstName, lastName);
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
	
	public void displayStudentGrades() {
		System.out.println("Student no. : "+this.getStudentNum());
		System.out.println("First name : "+this.getFirstName());
		System.out.println("Last name : "+this.getLastName());
		System.out.println("Module results");
		System.out.println("Program : "+this.program);
		System.out.println("Comp Found : "+this.compFound);
		System.out.println("DBs : "+this.dbs);
		System.out.println("Web : "+this.web);
		System.out.println("Software E : "+this.softwareEng);
		System.out.println("Average : "+calculateAverage());
		System.out.println("Classification : "+this.classification);
	}
	
	public int calculateAverage() {
		
		int total, average;
		
		total = (this.program*2)+this.compFound+this.dbs+this.web+this.softwareEng;
		average = total/6;
		
		return average;
		
	}
	
	public void calculateClassification() {
		
		int average = calculateAverage();
		
		if(average>100 || average<0) {
			this.classification = "error";
		} else if (average>=70 && average<=100) {
			this.classification = "distinction";
		} else if (average>=60 && average<=69) {
			this.classification = "merit";
		} else if (average>=50 && average<=59) {
			this.classification = "pass";
		} else {
			this.classification = "fail";
		}
		
	}

}
