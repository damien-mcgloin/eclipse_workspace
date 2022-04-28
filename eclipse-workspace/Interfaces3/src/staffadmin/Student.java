/**
 * 
 */
package staffadmin;

/**
 * @author damienmcgloin
 *
 */
public class Student extends Employee {

	private String studentNumber;
	
	/**
	 * 
	 */
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(String employeeNumber, String name, String studentNumber) {
		super(employeeNumber, name);
		this.studentNumber = studentNumber;
	}

	/**
	 * @return the studentNumber
	 */
	public String getStudentNumber() {
		return studentNumber;
	}

	/**
	 * @param studentNumber the studentNumber to set
	 */
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
}
