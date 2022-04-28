/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package accountcashcard;

/**
 *
 * @author ioneill
 */
public class Account {
    private CashCard theCard;

    public CashCard getCard(){
            return theCard;
    }

    public void setCard(CashCard card){
        theCard = card;
    }

    public void removeCard(CashCard card){
        theCard = null;
    }
}
