package challenge;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class ScoreManager {
	
	public static ArrayList<String> results = new ArrayList<String>();
	
	private static Map<String, Team> teams = new HashMap<String, Team>();
	
	private final static int WIN_POINTS = 3;
	private final static int DRAW_POINTS = 1;
	private final static int LOSS_POINTS = 0;
	
	public static void main(String[] args) {
		
		readFile();
		// now process the results
		processResults();
		// output to screen the stats for each team
		showAllTeamsStats();
		// show the league table
		showLeague();

	}
	
	public static void readFile() {
		
		File file;
		FileReader fr;
		BufferedReader br;
		
		String result;
		
		file = new File("Results.txt");
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			
			result = br.readLine();
			
			while(result!=null) {
				results.add(result);
				result = br.readLine();
			}
			System.out.println(results.toString());
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void processResults() {
		
		String tokenedResult[] = null;
		String team1, team2;
		int team1Goals, team2Goals, team1Pts, team2Pts;
		
		for (String result: results) {
			
			tokenedResult = result.split(" ");
			team1 = tokenedResult[0];
			team1Goals = Integer.parseInt(tokenedResult[1]);
			team2Goals = Integer.parseInt(tokenedResult[2]);
			team2 = tokenedResult[3];
			if(team1Goals>team2Goals) {
				team1Pts = WIN_POINTS;
				team2Pts = LOSS_POINTS;
			} else if (team2Goals>team1Goals) {
				team1Pts = LOSS_POINTS;
				team2Pts = WIN_POINTS;
			} else {
				team1Pts = DRAW_POINTS;
				team2Pts = DRAW_POINTS;
			}
			
			updateTeamStats(team1, team1Goals, team2Goals, team1Pts);
			updateTeamStats(team2, team2Goals, team1Goals, team2Pts);
			
		}
		
	}
	
	/**
	 * Updates / stores the team stats.
	 * 
	 * @param team
	 * @param goalsScored
	 * @param goalsConceeded
	 * @param teamPts
	 */
	public static void updateTeamStats(String team, int goalsScored,
			int goalsConceeded, int teamPts) {
		
		if (teams.containsKey(team)) {
			
			Team teamDetails = teams.get(team);
			teamDetails.incrementGamesPlayed();
			teamDetails.increaseGoalsFor(goalsScored);
			teamDetails.increaseGoalsAgainst(goalsConceeded);
			
			switch(teamPts) {
			case WIN_POINTS:
				teamDetails.incrementWins();
				break;
			case DRAW_POINTS:
				teamDetails.incrementDraws();
				break;
			case LOSS_POINTS:
				teamDetails.incrementLosses();
				break;
			default:
				break;
			}  
				
			} else {
				teams.put(team, new Team(team));
				updateTeamStats(team, goalsScored, goalsConceeded, teamPts);
			
		}
		
	}
	
	/**
	 * Shows each team stats to screen
	 */
	public static void showAllTeamsStats() {
		// sort by keys (alphabetically) - switching to a TreeMap
		SortedMap<String, Team> sortedTeams = new TreeMap<>(teams);
		// show all
		for (String team : sortedTeams.keySet()) {
			System.out.println(team);
			Team t = teams.get(team);
			System.out.println(t.stats() + "\n");
		}
	}

	/**
	 * Shows the league details in the format... Team Played For Against W D L
	 * Points Arsenal 3 17 4 3 0 0 9
	 */
	public static void showLeague() {
		// Going to need to order by points so first get the values in the
		// HashMap and put into a List
		List<Team> allTeams = new ArrayList<Team>(teams.values());

		// now sort using comparator
		Collections.sort(allTeams, new ComparePoints());

		// output to screen (lots of formatting here - don't spend too much time on formatting getting the data out is the main thing
		// although if really keen https://www.baeldung.com/java-printstream-printf !) 
		System.out.printf("%-20s %-6s %-5s %-10s %-2s %-2s %-8s %-6s\n",
				"Team", "Played", "For", "Against", "W", "D", "L", "Points");
		for (Team t : allTeams) {
			System.out.printf("%-20s %-6d %-5d %-10d %-2d %-2d %-8d %-6d\n",
					t.getName(), t.getGamesPlayed(), t.getGoalsFor(),
					t.getGoalsAgainst(), t.getWins(), t.getDraws(),
					t.getLosses(), t.pointsTotal());
		}
	}

}
