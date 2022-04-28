/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package accountmanager;

/**
 *
 * @author ioneill
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Account account1 = new Account();
        account1.setAccountNumber(1);
        Account account2 = new Account();
        account2.setAccountNumber(2);
        Account account3 = new Account();
        account3.setAccountNumber(3);


        Manager manager = new Manager();

        manager.addAccount(account1);
        manager.addAccount(account2);
        manager.addAccount(account3);

        /*
        System.out.println("Linked list account 0 is: " + manager.getAccount(0).getAccountNumber());
        manager.removeAccount(0);
        System.out.println("Linked list account 0 is: " + manager.getAccount(0).getAccountNumber());
        manager.removeAccount(0);
        System.out.println("Linked list account 0 is: " + manager.getAccount(0).getAccountNumber());
        manager.removeAccount(0); 
         */
        
        System.out.println("Linked list account 1 is: " + manager.getAccount(1).getAccountNumber());
        manager.removeAccount(1);
        System.out.println("Linked list account 0 is: " + manager.getAccount(0).getAccountNumber());
        manager.removeAccount(0);
        System.out.println("Linked list account 0 is: " + manager.getAccount(0).getAccountNumber());
        manager.removeAccount(0);

    }

}
