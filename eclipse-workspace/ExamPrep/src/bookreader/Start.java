package bookreader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Start {

	public static Queue<String> wholeText = new LinkedList<String>();
	public static BookReadToScreen bookReadToScreen = new BookReadToScreen();

	public static void main(String[] args) {

		System.out.println("Welcome to QUB Book Read");
		showMenu();
		System.out.println("Application Done");

	}

	public static void showMenu() {
		System.out.println();
		Scanner scanner = new Scanner(System.in);
		int option;
		System.out.println("Book reading ");
		do {
			System.out.println("1. Load book");
			System.out.println("2. Read / Resume book");
			System.out.println("3. Pause read");
			System.out.println("4. Speak book");
			System.out.println("5. Pause speak");
			System.out.println("6. Quit");

			System.out.println("Enter option ...");
			option = scanner.nextInt();

			switch (option) {
			case 1:
				readBookFile();
				System.out.println("Book loaded");
				break;
			case 2:
				if (wholeText.isEmpty()) {
					System.out.println("Load book first...");
				} else {
					readBookToScreen();
				}
				break;
			case 3:
				stopRead();
				break;
			case 4:

				break;
			case 5:

				break;
			case 6:
				// ensuring all threads are going finish
				bookReadToScreen.setStopRead(true);

				System.out.println("Quitting...");
				break;
			default:
				System.out.println("Try options again...");
			}
		} while (option != 6);
		scanner.close();
	}

	public static void readBookFile() {
		try {
			FileReader fr = new FileReader(new File("Dracula.txt"));
			BufferedReader br = new BufferedReader(fr);

			// read the first line.
			String line = br.readLine();
			while (line != null) {
				wholeText.add(line);
				line = br.readLine();
			}

			fr.close();
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void readBookToScreen() {
		bookReadToScreen.setStopRead(false);
		Thread readToScreenThread = new Thread(bookReadToScreen);
		readToScreenThread.start();
	}

	public static void stopRead() {
		System.out.println("Going to stop the read");
		bookReadToScreen.setStopRead(true);
	}

}
