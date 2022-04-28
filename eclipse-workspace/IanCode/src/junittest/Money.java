package junittest;

public class Money {

	private int amount;
	private String currency;

	public Money(int amt, String curr) {
	amount= amt;
	currency= new String(curr);
	}

	public int getAmount() {
	return amount;
	}

	public String getCurrency() {
	return currency;
	}

	public Money add(Money m) {
	   if (m.getCurrency().equals(currency))
	       return new Money(amount + m.getAmount(),new String(currency));
	       else
	            return null;
	}

}
