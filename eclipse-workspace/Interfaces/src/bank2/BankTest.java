package bank2;

public class BankTest {

	public static void main(String[] args) {
		
		BankAccount ba = new BankAccount();
		ba.setAccNumber(1111);
		ba.displayAll();
		
		PersonalAccount pa = new PersonalAccount();
		pa.setAccNumber(2222);
		pa.setFirstName("Aidan");
		pa.setLastName("McG");
		pa.displayAll();
		
		BusinessAccount bs = new BusinessAccount();
		bs.setAccNumber(3333);
		bs.setBusinessName("QUB");
		bs.displayAll();
		bs.printStatement();

	}

}
