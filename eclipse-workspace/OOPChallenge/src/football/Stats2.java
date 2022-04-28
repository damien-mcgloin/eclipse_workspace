package football;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Stats2 {

		public static void main(String[] args) {
			
			readFile();
			
			
		}
		
		public static void readFile() {
			
			File file = new File("WorldCupMatches.csv");
			FileReader fr;
			BufferedReader br;
			String results;
			String[] resultInfo;

			
			try {
				fr = new FileReader(file);
				br = new BufferedReader(fr);
				
				results = br.readLine();
				results = br.readLine();
				
				do {
					Match match = new Match();
					
					resultInfo = results.split(",");
					
					match.setYear(Integer.parseInt(resultInfo[0]));
					match.setHost(resultInfo[1]);
					match.setStage(resultInfo[2]);
					match.setStadium(resultInfo[3]);
					match.setCity(resultInfo[4]);
					match.setAttendance(Integer.parseInt(resultInfo[5]));
					match.setHomeTeamName(resultInfo[6]);
					match.setHomeTeamGoals(Integer.parseInt(resultInfo[7]));
					match.setAwayTeamGoals(Integer.parseInt(resultInfo[8]));
					match.setAwayTeamName(resultInfo[9]);
					match.setWinConditions(resultInfo[10]);
					match.setHalfTimeHomeGoals(Integer.parseInt(resultInfo[11]));
					match.setHalfTimeAwayGoals(Integer.parseInt(resultInfo[12]));
					match.setHomeTeamInitials(resultInfo[13]);
					match.setAwayTeamInitials(resultInfo[14]);
										
					results=br.readLine();
					
				} while (resultInfo!=null);
				
				fr.close();
				br.close();
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}
