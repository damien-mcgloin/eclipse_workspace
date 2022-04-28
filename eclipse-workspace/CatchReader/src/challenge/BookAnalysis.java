package challenge;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BookAnalysis {

	public static Queue<String> wholeText = new LinkedList<String>();
	public static List<String> alsoWholeText = new ArrayList<String>();
	public static List<String> redactedText = new ArrayList<String>();
	public static BookReadToScreen bookReadToScreen = new BookReadToScreen();

	public static void main(String[] args) {
		readFile();
		// printToScreen();
		lineCounter(alsoWholeText);
		characterCounter(alsoWholeText);
		wordCounter(alsoWholeText);
		nameCounter(alsoWholeText, "Yossarian");
		readRedacted(redactedText);

	}

	public static void readFile() {

		File file = new File("Catch 22.txt");
		FileReader fr;
		BufferedReader br;

		String line;

		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);

			line = br.readLine();
			while (line != null) {
				wholeText.add(line);
				alsoWholeText.add(line);
				line = br.readLine();
			}

			fr.close();
			br.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void printToScreen() {

		Thread readThread = new Thread(bookReadToScreen);
		readThread.start();
	}

	public static void lineCounter(List<String> books) {

		int lineCounter = 0;

		for (String line : books) {
			lineCounter++;
		}

		System.out.println("The total number of lines is " + lineCounter);

	}

	public static void wordCounter(List<String> books) {

		int wordCounter = 0;

		for (String line : books) {
			String[] words = line.split(" ");
			wordCounter += words.length;
		}

		System.out.println("The total number of words is " + wordCounter);

	}

	public static void characterCounter(List<String> books) {

		int characterCounter = 0;

		for (String line : books) {
			characterCounter += line.length();
		}

		System.out.println("The total number of characters is " + characterCounter);

	}

	public static void nameCounter(List<String> books, String name) {

		int nameCounter = 0;

		for (String line : books) {
			if (line.contains(name)) {
				nameCounter++;
			}
		}

		System.out.println("The name " + name + " appears " + nameCounter + " times in the text");

	}
	
	public static void redactName(List<String> books, String name) {

		for (String line : books) {
			if (line.contains(name)) {
				line.replace(name, "-----------");
			}
		}
		
		for(String line : books) {
			redactedText.add(line);
		}

	}
	
	public static void readRedacted(List<String> books) {
		
		for (String line : books) {
			System.out.println(line);
		}
		
	}

}
