

package accountcashcardoneaccountonecard;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Account account = new Account();
        System.out.println(account.hashCode());
        System.out.println(account.getCard().getAccount().hashCode());
    
    }

}
