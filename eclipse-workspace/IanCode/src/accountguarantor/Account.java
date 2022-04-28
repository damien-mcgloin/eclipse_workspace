/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package accountguarantor;

/**
 *
 * @author ioneill
 */
public class Account {
    private Guarantor theGuarantor;

    public Account(Guarantor g){
        if (g == null){
           System.out.println("NullLinkError");
        }
        theGuarantor = g;
    }
    public Guarantor getGuarantor(){
            return theGuarantor;
        }

}
