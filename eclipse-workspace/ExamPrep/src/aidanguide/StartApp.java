package aidanguide;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * @author Damien McGloin 40000631
 *
 */
public class StartApp {

	public static List<Student> students = new ArrayList<Student>();
	
	/**
	 * Start point 
	 * @param args
	 */
	public static void main(String[] args) {
		readDataFile();
		showMenu();
	}

	private static void showMenu() {
		int userOption;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("Menu");
			System.out.println("1. Show all");
			System.out.println("2. Calculate average for p1");
			System.out.println("3. Calculate average for p2");
			// any more ...
			System.out.println("4. Quit");
			System.out.println("Enter option ");
			userOption = scanner.nextInt();

			switch (userOption) {
			case 1:
				showAll();
				break;
			case 2:
				displayAverageP1();
				break;
			case 3:
				break;
			case 4:
				System.out.println("Quitting");
				break;
			default:
				System.out.println("Done");
			}

		} while (userOption != 4);
		scanner.close();
	}
	
	/**
	 * 
	 */
	private static void readDataFile() {

		File file = new File("aidanguide.csv");

		FileReader fileReader;
		BufferedReader bufferedReader;
		String studentInfo;
		String[] stats;

		try {
			fileReader = new FileReader(file);
			bufferedReader = new BufferedReader(fileReader);
			// parse each data point - by comma

			bufferedReader.readLine();
			// ditch the first line (header values)
			studentInfo = bufferedReader.readLine();

			do {
				// create a player and add the stats
				Student student = new Student();
				stats = studentInfo.split(",");

				// parse info into parts

				student.setID(Integer.parseInt(stats[0]));
				student.setName(stats[1]);
				student.setP1(Integer.parseInt(stats[2]));
				student.setP2(Integer.parseInt(stats[3]));
				student.setP3(Integer.parseInt(stats[4]));

				
				// add to collection of students
				students.add(student);

				// read the next line
				studentInfo = bufferedReader.readLine();

			} while (studentInfo != null);

			// close all
			fileReader.close();
			bufferedReader.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 
	 */
	public static void showAll() {
		for (Student student : students ) {
			student.displayAll();
		}
	}
	
	
	public static void displayAverageP1() {
		
		int total = 0;
		double average;
		for (Student student : students ) {
			total+= student.getP1();
		}
		average = (double)total/ students.size();
		System.out.println("Average P1 is "+average);
	}
}