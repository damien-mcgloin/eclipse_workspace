package p3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 
 * @author Damien McGloin 40000631
 *
 */
public class PrintDataToNewFile implements Runnable {

	// thread class for printing new file
	@Override
	public void run() {
		
		try {

			File file = new File("playerstats_updated.csv");

			// validation to check if a file already exists
			if (!file.exists()) {
				file.createNewFile();
			}

			FileWriter fw;
			BufferedWriter bw;

			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);

			// adds header line
			bw.write("Last name" + ",First name" + ",Country"+ "\n");

			// loops through player list and prints capitalized last name, first name and country code
			for (Player player : StartApp.playerList) {
				bw.write(player.getLastName().toUpperCase() + "," + player.getFirstName() + "," + player.getCountryCode()+ "\n");
			}

			bw.close();
			fw.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
