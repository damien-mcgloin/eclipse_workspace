package p3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;


/**
 * Damien McGloin 40000631
 * 
 *
 */
public class StartApp {
	
	public static List<Player> playerList = new ArrayList<Player>();
	// no duplicates list method didn't work. Initially tried using a set to store unique values but error returned when tried.
	public static List<Player> noDuplicatesList = new ArrayList<Player>();
	// thread for printing file
	public static PrintDataToNewFile printDataToNewFile = new PrintDataToNewFile();

	public static void main(String[] args) {
		readData(); 
		showMenu();

		
	}

	public static void showMenu() {
		System.out.println();
		Scanner scanner = new Scanner(System.in);
		int option;
		System.out.println("Book reading ");
		do {
			System.out.println("1. Display all players");
			System.out.println("2. Display all players from Ireland");
			System.out.println("3. Display the highest point scorer ");
			System.out.println("4. Display all players by height and name");
			System.out.println("5. Display each club (in alphabetical order with the cumulative number of games played in the six nations (Total Matches) by each player from that club ");			
			System.out.println("6. Capitalise the Last name and export/write to a new file in a new thread in the format Lastname, first name and country ");
			System.out.println("7. Quit");
			System.out.println("Enter option ...");
			option = scanner.nextInt();

			switch (option) {
				
			case 1:
				printData(playerList);
				break;
			case 2:
				printIrelandPlayers(playerList);
				break;
			case 3:
				displayHighestScorer(playerList);
				break;
			case 4:
				displayByHeight(playerList);
				break;
			case 5:
				displayAllClubsWithTotalGames(playerList);
				break;
			case 6:
				writeData(playerList);
				break;
			case 7:
				System.out.println("Quitting");
				break;		
			default:
				System.out.println("Try options again...");
			}
		} while (option != 7);
		scanner.close();
	}

	/**
	 * Reads in the data from the csv and maps to the Player class 
	 */
	public static void readData() {

		File file = new File("playerstats.csv");
		FileReader fr;
		BufferedReader br;
		
		String playerInfo;
		String[] stats;
		String firstName;
		String lastName;
		String[] name;
		
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			
			// skipping header line
			br.readLine();
			
			playerInfo = br.readLine();
			
			do {
				
				Player player = new Player();
				
				// splitting data at the commas
				stats = playerInfo.split(",");
				
				int playerCode;
				String code;
				
				// sets the code based on integer value in data
				playerCode = Integer.parseInt(stats[0]);
				
				if(playerCode == 1) {
					code = "ENG";
				} else if (playerCode == 2) {
					code = "FRA";
				} else if (playerCode == 3) {
					code = "IRE";
				} else if (playerCode == 4) {
					code = "ITA";
				} else if (playerCode == 5) {
					code = "SCO";
				} else {
					code = "WAL";
				}
				
				// splits the player name into first and last name vars
				player.setCountryCode(code);
				
				firstName = stats[1];
				lastName = stats[1];
				
				name = firstName.split(" ");
				firstName = name[0];
				lastName = name[1];
				
				player.setFirstName(firstName);
				
				player.setLastName(lastName);
				
				player.setForwardOrBack(stats[2]);
				player.setTotalMatches(Integer.parseInt(stats[3]));
				player.setPointsScored(Integer.parseInt(stats[4]));
				player.setGamesWon(Integer.parseInt(stats[5]));
				player.setSixNationsLost(Integer.parseInt(stats[6]));
				player.setSixNationsDraw(Integer.parseInt(stats[7]));
				player.setHeightInMetres(Double.parseDouble(stats[8]));
				player.setClub(stats[9]);
				player.setInfluence(Integer.parseInt(stats[10]));
				
				// calculates win percentage
				int gamesWon = player.getGamesWon();
				int totalMatches = player.getTotalMatches();
				double winPercentage = (double) gamesWon/totalMatches*100;
				
				//player.setWinPercentage((double) ( player.getGamesWon() / player.getTotalMatches() ) * 100 );
				
				player.setWinPercentage(winPercentage);
				
				playerList.add(player);
				//players.add(player);
				
				playerInfo = br.readLine();
				
			} while(playerInfo != null);
			
			fr.close();
			br.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	public static void printData(List<Player> playerData) {
				
		// loops through all player values in list and returns player data
		// extra line added for formatting
		for(Player player : playerData) {
			player.showAllData();
			System.out.println();
		}
		
	}
	
	public static void printIrelandPlayers(List<Player> playerData) {
		
		System.out.println("All players from Ireland");
		
		// loops through player values in list and return player names if from ireland
		for(Player player : playerData) {
			if(player.getCountryCode().equals("IRE")) {
				System.out.println(player.getFirstName()+" "+player.getLastName());
			}
		}
	}
	
	public static void displayHighestScorer(List<Player> playerData) {
		
		// sorts data based on points scored
		Collections.sort(playerData, new CompareByPoints());
		
		System.out.println("The highest scorer is : ");
		
		// prints first index which is the highest scorer
		System.out.println(playerData.get(0).getFirstName()+" "+playerData.get(0).getLastName()+" "+
				playerData.get(0).getCountryCode()+" "+playerData.get(0).getPointsScored());
		
	}
	
	public static void displayByHeight(List<Player> playerData) {
		
		// sorts data based on height
		Collections.sort(playerData, new CompareByHeight());
		
		System.out.println("Players listed by height descending");
		
		// loops through list and returns player height and name in order of height descending
		for(Player player : playerData) {
			System.out.println(player.getHeightInMetres()+" \t"+player.getFirstName()+" "+player.getLastName());
		}
		
	}
	
	public static void displayAllClubsWithTotalGames(List<Player> playerData) {
		
		Map<String, Integer> clubMap = new TreeMap<>();
		SortedMap<String, Integer> clubPointMap = new TreeMap<String, Integer>();

		// creates map with unique club values 
		for (Player p : playerData) {
			if (clubMap.containsKey(p.getClub())) {
				continue;
			} else {
				clubMap.put(p.getClub(), 0);
			}
		}

		// compares list and map. creates total number of matches played per player per club
		for (String p : clubMap.keySet()) {
			int matchTotal = 0;

			for (Player player : playerData) {
				if (player.getClub().equals(p)) {
					matchTotal+=player.getTotalMatches();
				} else {
					continue;
				}
			}

			// adds clubs and point total for each to map
			clubPointMap.put(p, matchTotal);

		}
		
		// sorted map used to order club names alphabetically
		for(String key : clubPointMap.keySet()) {
			System.out.println(key+" "+clubPointMap.get(key));
		}
		
	}
	
	public static void writeData(List<Player> playerData) {
		
		// prints list to file in new thread
		
		Thread printThread = new Thread(printDataToNewFile);
		
		printThread.start();

	}
	
	// method to try making list with unique values - doesn't seem to work 
	public static void removeDuplicates(List<Player> playerData) {
		
		for(Player player : playerData) {
			if(!noDuplicatesList.contains(player)) {
				noDuplicatesList.add(player);
			} 
		}
		
		for(Player player : noDuplicatesList) {
			player.showAllData();
			System.out.println();
		}
		
	}

}
