/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package arena_2fwdeng;

/**
 *
 * @author ioneill
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Advertiser advertiser = new Advertiser();
        LeagueOwner leagueOwner = new LeagueOwner();
        Player player = new Player();

        advertiser.setEmail("advertiser@advertiser.com");
        leagueOwner.setEmail("leagueOwner@leagueOwner.com");
        leagueOwner.setMaxNumLeagues(3);
        player.setEmail("player@player.com");

        System.out.println();
        System.out.println(advertiser.getEmail());
        System.out.println(leagueOwner.getEmail() + " " +leagueOwner.getMaxNumLeagues());
        System.out.println(player.getEmail());
        System.out.println();

    }

}
