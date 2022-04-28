package zoo3;

public class BankTest {

	public static void main(String[] args) {
		
		BankAccount ba = new BankAccount();
		ba.setAccNumber(11111);
		ba.displayAll();
		
		PersonalAccount pa = new PersonalAccount();
		pa.setAccNumber(2222);
		pa.setFirstName("Aidan");
		pa.setLastName("McG");
		pa.displayAll();
		
		BusinessAccount bab = new BusinessAccount();
		bab.setAccNumber(333);
		bab.setBusinessName("QUB");
		bab.displayAll();
		bab.printStatement();

	}

}
