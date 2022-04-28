/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package accounthash;
 import java.util.Hashtable;

/**
 *
 * @author ioneill
 */
public class Bank {
    private Hashtable<Integer,Account> theAccounts =  new Hashtable<Integer,Account>();

    public void addAccount (Account a) {
        theAccounts.put(a.getNumber(), a);
    }
    public void removeAccount(int accno) {
        theAccounts.remove(accno);
    }
    public Account lookupAccount(int accno) {
        return (Account) theAccounts.get(accno);
    }
}


