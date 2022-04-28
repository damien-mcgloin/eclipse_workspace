package rw;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AppendToFileExample {

	public static void main(String[] args) {

		try {
			String data = "\nLeeds";
			File file = new File("Teams.txt");

			if (!file.exists()) {
				file.createNewFile();
			}

			FileWriter fileWriter = new FileWriter(file.getName(), true);

			BufferedWriter bufferWriter = new BufferedWriter(fileWriter);
			bufferWriter.write(data);
			bufferWriter.close();
			fileWriter.close();
			System.out.println("Done - check the file !");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
