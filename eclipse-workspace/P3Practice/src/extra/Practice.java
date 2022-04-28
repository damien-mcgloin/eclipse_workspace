package extra;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Practice {

	public static List<StudentPractice> students = new ArrayList<StudentPractice>();
	
	private static final int MAX_SIZE = 1;
	
	public static void main(String[] args) {
		
		readFile();
		showMenu();
		changeList();
		//shortenList();
		//maxSize();
		//changeToSet();

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
				showAll(students);
				break;
			case 2:
				calculateP1Average();
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
	
	public static void readFile() {
		
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
				StudentPractice student = new StudentPractice();
				stats = studentInfo.split(",");
				
				student.setID(Integer.parseInt(stats[0]));
				student.setName(stats[1]);
				student.setP1(Integer.parseInt(stats[2]));
				student.setP2(Integer.parseInt(stats[3]));
				student.setP3(Integer.parseInt(stats[4]));
				
				students.add(student);
				
				studentInfo = br.readLine();
				
			} while (studentInfo != null);
			
			fr.close();
			br.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void showAll(List<StudentPractice> list) {
		for(StudentPractice student : students) {
			student.displayAll();
		}


	}
	
	public static void calculateP1Average() {
		
		int total = 0;
		double average;
		
		for(StudentPractice student : students) {
			total+=student.getP1();
		}
		
		average = (double)total/students.size();
		
		System.out.printf("The P1 average is : %.2f\n",average);
		
	}
	
	public static void changeList() {
		
		List<StudentPractice> LinkList = new LinkedList<StudentPractice>();
		
		for(StudentPractice student : students) {
			LinkList.add(student);
		}
		
		//LinkList.add(5, "hello");
		
	}
	
	public static void swap(List<String> list, int position1, int position2) {
		
		String temp = list.get(position1);
		list.set(position1, list.get(position2));
		list.set(position2, temp);
		
	}
	
	public static void shortenList() {
		
		List<StudentPractice> ShortList = new ArrayList<StudentPractice>();
		
		for(StudentPractice student : students) {
			ShortList.add(student);
		}
		
		ShortList = students.subList(0, 2);
		
		for(StudentPractice student : ShortList) {
			student.displayAll();
			System.out.println();
		}
		
	}
	
	public static void maxSize() {
		
		List<StudentPractice> MaxList = new ArrayList<StudentPractice>();
		
		for(StudentPractice student : students) {
			if (MaxList.size() < MAX_SIZE) {
			MaxList.add(student);
			} 
			
		}

		for(StudentPractice student : MaxList) {
			student.displayAll();
		}
		
	}
	
	public static void changeToSet() {
		
		SortedSet<StudentPractice> sset = new TreeSet<StudentPractice>();
		
		for(StudentPractice student : students) {
			sset.add(student);
		}
		
		for(StudentPractice student : sset) {
			System.out.println(student);
		}
		
	}

}
