/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package account;

/**
 *
 * @author ioneill
 */
public class Account_Cloneable implements Cloneable {
	private double balance = 0.0;
	private double min_balance = 0.0;

	public Account_Cloneable() {
		balance = min_balance = 0.0;
	}

	public void deposit(final double amount) {
		balance = balance + amount;
	}

	public double withdraw(final double amount) {
		if ((balance - amount) >= min_balance) {
			balance = balance - amount;
			return amount;
		} else {
			return 0.0;
		}
	}

	public double account_balance() {
		return balance;
	}

	public void set_min_balance(final double amount) {
		min_balance = amount;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
