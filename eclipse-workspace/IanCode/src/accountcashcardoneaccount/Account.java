/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package accountcashcardoneaccount;

/**
 *
 * @author ioneill
 */
public class Account {
    private CashCard theCard;

    public void addCard(){
        theCard = new CashCard(this);
    }

    public CashCard getCard(){
            return theCard;
    }

    public void removeCard(){
        theCard = null;
    }
}
