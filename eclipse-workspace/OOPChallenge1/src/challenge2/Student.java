package challenge2;

public class Student {
	
	private int studentNum;
	private String firstName;
	private String lastName;
	
	public Student() {
		
	}
	
	public Student(int studentNum, String firstName, String lastName) {
		this.studentNum = studentNum;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	/**
	 * @return the studentNum
	 */
	public int getStudentNum() {
		return studentNum;
	}

	/**
	 * @param studentNum the studentNum to set
	 */
	public void setStudentNum(int studentNum) {
		this.studentNum = studentNum;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
