/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package arena_3;

/**
 *
 * @author ioneill
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Advertiser advertiser = new Advertiser("advertiser@advertiser.com");
        LeagueOwner leagueOwner = new LeagueOwner("leagueOwner@leagueOwner.com");
        Player player = new Player("player@player.com");

        System.out.println();
        System.out.println(advertiser.getEmail());
        System.out.println(leagueOwner.getEmail());
        System.out.println(player.getEmail());
        System.out.println();

    }

}
