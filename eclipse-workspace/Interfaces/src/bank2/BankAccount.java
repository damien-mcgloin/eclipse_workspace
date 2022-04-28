package bank2;

public class BankAccount {

	private int accNumber;
	
	public BankAccount() {
		
	}
	
	public BankAccount(int accNumber) {
		this.accNumber = accNumber;
	}

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
		System.out.println("Acc num "+this.accNumber);
	}
	
	
	
}
