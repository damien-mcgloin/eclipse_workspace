package junittestnew;

import static org.junit.Assert.*;

import org.junit.Test;


public class MoneyTest {

	@Test
	public void testAdd() {
		Money moneyTester = new Money(5,"GBP");
		Money moneyAmount = new Money(5,"GBP");
		Money wrongCurrency = new Money(5,"USD");
		Money addResult = moneyTester.add(moneyAmount);
		Money wrongAddResult = moneyTester.add(wrongCurrency);
		Money expectedResult = new Money(10,"GBP");
		Money wrongExpectedResult = null;
		
		assertEquals("Amount",expectedResult.getAmount(),addResult.getAmount());
		assertEquals("Currency",expectedResult.getCurrency(),addResult.getCurrency());
		assertEquals("Wrong",wrongExpectedResult,wrongAddResult);
	}

}
