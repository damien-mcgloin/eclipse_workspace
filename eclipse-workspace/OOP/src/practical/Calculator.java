package practical;

public class Calculator {
	
	private int memory;

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
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
	
	/**
	 * 
	 * @param num
	 * @return
	 */
	public double sqrRoot(int num) {
		return Math.sqrt(num);
	}
	
	public void clearMemory() {
		this.memory = 0;
	}

}
