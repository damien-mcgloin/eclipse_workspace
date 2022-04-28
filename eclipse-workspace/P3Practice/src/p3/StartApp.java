package p3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

/**
 * 
 * @author Damien McGloin 40000631
 *
 */
public class StartApp {

	public static List<Student> students = new ArrayList<Student>();
	
	/**
	 * Start point for application
	 * @param args
	 */
	public static void main(String[] args) {
		readData();
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
			// and a few more task etc... 
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
	 * method for reading the file and outputting data
	 */
	public static void readData() {
		File file;
		FileReader fr;
		BufferedReader br;
		
		String studentInfo;
		String[] stats;
		
		file = new File("results.csv");
		
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			
			br.readLine();
			studentInfo = br.readLine();
			
			do {
				Student student = new Student();
				stats = studentInfo.split(",");
				
				student.setID(Integer.parseInt(stats[0]));
				student.setName(stats[1]);
				student.setP1(Integer.parseInt(stats[2]));
				student.setP2(Integer.parseInt(stats[3]));
				student.setP3(Integer.parseInt(stats[4]));
				
				students.add(student);
				
				// read the next line
				studentInfo = br.readLine();
				
			} while(studentInfo != null);
			// close file and buffered reader
			fr.close();
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void showAll() {
		for (Student student : students) {
			student.displayAll();
		}
	}
	
	public static void displayAverageP1() {
		int total = 0;
		double average;
		for (Student student : students) {
			total+= student.getP1();
		}
		
		average = (double)total/students.size();
		
		System.out.println("Average for P1 is : "+average);
		
	}
	
	
}

