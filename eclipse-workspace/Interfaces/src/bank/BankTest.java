package bank;

public class BankTest {

	public static void main(String[] args) {
		
		BankAccount ba = new BankAccount(11111);	
		ba.displayAll();
		
		PersonalAccount pa = new PersonalAccount("Damien", "McGloin");
		pa.setAccNumber(2222);
		pa.displayAll();
		
		BusinessAccount ba2 = new BusinessAccount("QUB");
		ba2.setAccNumber(33333);
		ba2.displayAll();
		ba2.printStatement();

	}

}
