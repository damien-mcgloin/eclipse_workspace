package catch22;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AlsoBookAnalysis {

	public static List<String> wholeText = new ArrayList<String>();
	public static Map<Character, Integer> staticMap = new HashMap<Character, Integer>();

	public static void main(String[] args) {

		readFile();
		// printFile(wholeText);
		//lineCounter(wholeText);
		//wordCounter(wholeText);
		//specificWordCounter(wholeText, "Yossarian");
		populateMap(wholeText);
		mostUsedLetter(staticMap);

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

	public static void printFile(List<String> book) {

		for (String line : book) {
			System.out.println(line);
		}
	}

	public static void lineCounter(List<String> book) {

		int lineCounter = 0;

		for (String line : book) {
			lineCounter++;
		}

		System.out.println("The number of lines is " + lineCounter);

	}

	public static void wordCounter(List<String> book) {

		int numberOfWords = 0;

		for (String line : book) {
			String[] words = line.split(" ");
			numberOfWords += words.length;
		}

		System.out.println(numberOfWords);

	}

	public static void specificWordCounter(List<String> book, String word) {

		int wordCounter = 0;

		for (String line : book) {
			if (line.contains(word)) {
				wordCounter++;
			}
		}

		System.out.println(word + " appears " + wordCounter + " times.");

	}

	public static void replaceWord(List<String> book, String word) {

		for (String line : book) {
			if (line.contains(word)) {
				String redactedLine = line.replace(word, "---------");
				// bw.write(redactedLine+"\n"
			} else {
				// bw.write(line+"\n");
			}
		}

	}

	public static void populateMap(List<String> list) {

		String line;
		char letter;

		for (String s : list) {
			line = s.toLowerCase();

			for (int loop = 0; loop < line.length(); loop++) {

				if (Character.isLetter(line.charAt(loop))) {
					letter = line.charAt(loop);
					
					if(staticMap.containsKey(letter)) {
						int value = staticMap.get(line.charAt(loop));
						staticMap.put(line.charAt(loop), value + 1);
					} else {
						staticMap.put(line.charAt(loop), 1);
					}

				}
			}
		}
		
		/* contains a count for every ketter in the text
		for(Character key : staticMap.keySet()) {
			System.out.println(key+" "+staticMap.get(key));
		}
		*/

	}
	
	public static void mostUsedLetter(Map<Character, Integer> map) {
		
		int highestCount = 0;
		char mostUsedLetter = ' ';
		for (Character charac : map.keySet()) {
			if(highestCount < map.get(charac)) {
				highestCount = map.get(charac);
				mostUsedLetter = charac;
			}
		}
		
		System.out.println("most used letter : "+mostUsedLetter+" "+ ": number of times used = "+highestCount);
		
	}

}
