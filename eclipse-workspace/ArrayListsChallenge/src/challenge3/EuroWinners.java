package challenge3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class EuroWinners {

	public static ArrayList<String> winnerList = new ArrayList<String>();

	public static void main(String[] args) {

		readInFile();
		
		int year = 1956;
		
		for(String list : winnerList) {
			System.out.println(year+++" : "+list.toString());
		}
		
	}

	public static void readInFile() {

		File file = new File("ECWinners.txt");
		FileReader fr;
		BufferedReader br;
		String winners;

		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			winners = br.readLine();

			do {
				winnerList.add(winners);
				winners = br.readLine();
			} while (winners != null);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
