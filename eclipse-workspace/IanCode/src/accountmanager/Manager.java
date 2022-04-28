/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package accountmanager;
import java.util.*;


/**
 *
 * @author ioneill
 */
public class Manager {
    private LinkedList<Account> theAccounts;

    public Manager() {
        theAccounts = new LinkedList<Account>();
    }

    public void addAccount(Account acc){
        theAccounts.add(acc);
    }

    public void removeAccount(int accIndex){
        theAccounts.remove(accIndex);
    }

    public Account getAccount(int accIndex){
        Account returnAccount = (Account)theAccounts.get(accIndex);
        return returnAccount;
    }

}

