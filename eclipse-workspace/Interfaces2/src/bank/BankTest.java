package bank;

public class BankTest {

	public static void main(String[] args) {
		
		BankAccount bankAccount = new BankAccount();
		bankAccount.setAccNumber(11111);
		bankAccount.displayAll();
		
		PersonalAccount personalAccount = new PersonalAccount();
		personalAccount.setAccNumber(2222);
		personalAccount.setFirstName("Damien");
		personalAccount.setLastName("McG");
		personalAccount.displayAll();
		
		BusinessAccount businessAccount = new BusinessAccount();
		businessAccount.setAccNumber(3333);
		businessAccount.setBusinessName("QUB");
		businessAccount.displayAll();
		businessAccount.printStatement();
	}

}
