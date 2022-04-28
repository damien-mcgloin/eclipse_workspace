package bank;

public class BankAccount {
	
	private int accNumber;

	/**
	 * @return the accNumber
	 */
	public int getAccNumber() {
		return accNumber;
	}

	/**
	 * @param accNumber the accNumber to set
	 */
	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}
	
	public void displayAll() {
		System.out.println("acc num "+this.accNumber);
	}

}
