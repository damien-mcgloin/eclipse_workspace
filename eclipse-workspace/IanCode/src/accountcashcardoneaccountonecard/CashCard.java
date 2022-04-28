/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package accountcashcardoneaccountonecard;

/**
 *
 * @author ioneill
 */
public class CashCard {

    private Account acc;

    CashCard(Account a){
        acc = a;
    }

    public Account getAccount(){
        return acc;
    }

}

