/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package accounthash;

/**
 *
 * @author ioneill
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bank bank = new Bank();

        Account account1 = new Account();
        account1.setNumber(1);

        Account account2 = new Account();
        account2.setNumber(2);

        bank.addAccount(account1);
        bank.addAccount(account2);

        System.out.println(bank.lookupAccount(1).getNumber());
        System.out.println(bank.lookupAccount(2).getNumber());
    }

}
