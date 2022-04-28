package bank;

public class BusinessAccount extends BankAccount implements IPrintable {

	private String businessName;
	
	public BusinessAccount() {
		
	}
	
	public BusinessAccount(String businessName) {
		this.businessName = businessName;
	}
	
	/**
	 * @return the businessName
	 */
	public String getBusinessName() {
		return businessName;
	}

	/**
	 * @param businessName the businessName to set
	 */
	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	@Override
	public void printStatement() {
		System.out.println("BANK STATEMENT");
		System.out.println("Printed ...");
		
	}
	
	@Override
	public void displayAll() {
		super.displayAll();
		System.out.println("Business name : "+this.businessName);
	}
	

}
