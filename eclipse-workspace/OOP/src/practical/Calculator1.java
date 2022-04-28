package practical;

public class Calculator1 {
	
	private int memory;

	/**
	 * @return the memory
	 */
	public int getMemory() {
		return memory;
	}

	/**
	 * @param memory the memory to set
	 */
	public void setMemory(int memory) {
		this.memory = memory;
	}
	
	public int addNumbers(int num1, int num2) {
		return num1+num2;
	}
	
	public double sqrroot(int num) {
		return Math.sqrt(num);
	}
	
	/**
	 * this method will set memory to 0
	 */
	public void clearMemory() {
		this.memory = 0;
	}

}
