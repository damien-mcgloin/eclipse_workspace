/**
 * 
 */
package challenge;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author damienmcgloin
 *
 */
public class Professor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ArrayList<MscStudent> students = new ArrayList<MscStudent>();
		
		readInStudentRecord(students);
		
		showAllRecords(students);
		
		displayClassifications(students);
		
		classifyStudents(students);

	}
	
	public static void readInStudentRecord(ArrayList<MscStudent> students) {
		
		File file = new File("ModuleScoresMsc.csv");
		FileReader fr;
		BufferedReader br;
		String studentRecord;
		String[] studentDetails;
		
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			
			try {
				br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			studentRecord = br.readLine();
			
			while(studentRecord!=null) {
				MscStudent student = new MscStudent();
				
				studentDetails = studentRecord.split(",");
				
				student.setStudentNumber(Integer.parseInt(studentDetails[0]));
				student.setFirstName(studentDetails[1]);
				student.setLastName(studentDetails[2]);
				
				student.setProgramming(Integer.parseInt(studentDetails[3]));
				student.setComputingFoundations(Integer.parseInt(studentDetails[4]));
				student.setDb(Integer.parseInt(studentDetails[5]));
				student.setWeb(Integer.parseInt(studentDetails[6]));
				student.setSoftwareEngineering(Integer.parseInt(studentDetails[7]));
				
				students.add(student);
				
				studentRecord = br.readLine();
				
				fr.close();
				br.close();
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("Can't file module scores file");
		} catch (IOException e) {
			System.out.println("Connection problems");
		} catch (Exception e) {
			System.out.println("Problems. Contact your admin");
		}
	}
	
	private static void showAllRecords(ArrayList<MscStudent> students) {
		for(MscStudent student: students) {
			student.displayStudentRecord();
		}
		System.out.println("Number of records : "+students.size());
	}
	
	private static void displayClassifications(ArrayList<MscStudent> students) {
		for(MscStudent student: students) {
			student.displayStudentClassification();
		}
		System.out.println("Number of records : "+students.size());
	}
	
	private static void classifyStudents(ArrayList<MscStudent> students) {
		for(MscStudent student: students) {
			student.classifyStudent();
		}
	}

}
