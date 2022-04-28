package practical;

public class Calculator2 {
	
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	public void setMemory (int memory) {
		this.memory = memory;
	}
	
	/**
	 * 
	 * @param num1
	 * @param num2
	 * @return
	 */
	public int addNumbers(int num1, int num2) {
		return num1+num2;
	}
	
	public double sqrRoot(int num1) {
		return Math.sqrt(num1);
	}

	/**
	 * This method will set memory to 0
	 */
	public void clearMemory() {
		this.memory = 0;
	}

}
