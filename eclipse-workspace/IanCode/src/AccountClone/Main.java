/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package AccountClone;
import java.text.DecimalFormat;

/**
 *
 * @author ioneill
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws CloneNotSupportedException {

       

       // experiment with generic Object methods
       Account_Cloneable accountObject1 = new Account_Cloneable();
       Account_Cloneable accountObject2 = new Account_Cloneable();

       if(accountObject1.equals(accountObject2))
           System.out.println("\nAccountObject1 and AccountObject2 are equal.");
       else
           System.out.println("\nAccountObject1 and AccountObject2 are not equal.");


       Account_Cloneable accountObject3 = (Account_Cloneable)accountObject1.clone();

       if(accountObject1.equals(accountObject3))
           System.out.println("\nAccountObject1 and AccountObject3 are equal.");
       else
           System.out.println("\nAccountObject1 and AccountObject3 are not equal.");


       Account_Cloneable accountObject4 = accountObject1;

       if(accountObject1.equals(accountObject4))
           System.out.println("\nAccountObject1 and AccountObject4 are equal.");
       else
           System.out.println("\nAccountObject1 and AccountObject4 are not equal.");


       accountObject1.deposit(1.00);
       double accountObject1Balance = accountObject1.account_balance();
       System.out.println("\naccountObject1 Balance is " + accountObject1Balance);

       double accountObject4Balance = accountObject4.account_balance();
       System.out.println("accountObject4 Balance is " + accountObject4Balance);

       double accountObject2Balance = accountObject2.account_balance();
       System.out.println("accountObject2 Balance is " + accountObject2Balance);

       double accountObject3Balance = accountObject3.account_balance();
       System.out.println("accountObject3 Balance is " + accountObject3Balance);


       System.out.println("\naccountObject1 hash code is " + accountObject1.hashCode());
       System.out.println("accountObject2 hash code is " + accountObject2.hashCode());
       System.out.println("accountObject3 hash code is " + accountObject3.hashCode());
       System.out.println("accountObject4 hash code is " + accountObject4.hashCode());

       System.out.println("\naccountObject1 to string is " + accountObject1.toString());
       System.out.println("accountObject2 to string is " + accountObject2.toString());
       System.out.println("accountObject3 to string is " + accountObject3.toString());
       System.out.println("accountObject4 to string is " + accountObject4.toString());


    }

    static double roundToTwoPlaces(double doubleToRound){

           DecimalFormat decimalOutput = new DecimalFormat("#.##");
           return Double.valueOf(decimalOutput.format(doubleToRound));
    }

}
