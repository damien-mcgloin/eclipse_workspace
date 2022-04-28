package challenge;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Start {
	
	public static Queue<String> wholeText = new LinkedList<String>();
	public static BookReadToScreen bookRead = new BookReadToScreen();

	public static void main(String[] args) {
		
		showMenu();

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
				readFile();
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
				//stopReadToScreen();
				break;
			case 4:
				
				break;
			case 5:
				
				break;
			case 6:
				// ensuring all threads are going finish
				//bookReadToScreen.setStopRead(true);

				System.out.println("Quitting...");
				break;
			default:
				System.out.println("Try options again...");
			}
		} while (option != 6);
		scanner.close();
	}
	
	public static void readFile() {
		
		File file = new File("Dracula.txt");
		FileReader fr;
		BufferedReader br;
		
		try {
			
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			
			String line = br.readLine();
			
			while(line!=null) {
				wholeText.add(line);
				line = br.readLine();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public static void readBookToScreen() {
		
		Thread thread = new Thread(bookRead);
		thread.start();
		
	}

}
