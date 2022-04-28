/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package accountcashcardoneaccount;

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

