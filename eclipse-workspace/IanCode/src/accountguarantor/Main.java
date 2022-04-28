/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package accountguarantor;

/**
 *
 * @author ioneill
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Guarantor guarantor = new Guarantor();

        Account account = new Account(guarantor);
        // or to force error
        //Account account = new Account(null);
        //or again...
        //Account account = new Account();
    }

}
