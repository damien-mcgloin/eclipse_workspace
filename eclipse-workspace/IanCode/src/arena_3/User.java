/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package arena_3;

/**
 *
 * @author ioneill
 */
public class User {
    protected String email;
    
    public User(String email){
        this.email = email;
    }

    public String getEmail(){
        return email;
    }
    
    public void setEmail(String value){
        email = value;
    }

}
