package junittest;

import static org.junit.Assert.*;

import org.junit.Test;

class MoneyTest {

	@Test
	public void testAdd() {
		Money moneyTester = new Money(5,"GBP");
		Money moneyAmount = new Money(5,"GBP");
		Money addResult = moneyTester.add(moneyAmount);
		Money expectedResult = new Money(10,"GBP");	
		
		assertEquals("Amount",expectedResult.getAmount(),addResult.getAmount());
		assertEquals("Currency",expectedResult.getCurrency(),addResult.getCurrency());
	}

}
