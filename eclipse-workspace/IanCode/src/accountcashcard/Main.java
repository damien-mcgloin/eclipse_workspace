/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package accountcashcard;

/**
 *
 * @author ioneill
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        CashCard card = new CashCard();

        Account account = new Account();
        account.setCard(card);
        account.removeCard(card);

    }

}
