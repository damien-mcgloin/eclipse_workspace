/**
 * 
 */
package assessment;

/**
 * @author damienmcgloin
 *
 */
public class assessment2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String name;
		
		name = "QUB Computer Science";
		
		// TODO : change name to upper case and output to screen
		System.out.println(name.toUpperCase());
		
		// TODO : output to screen the total number of non space characters in name i.e. A B C etc. but ignore any " " in the count
		int letterCounter = 1; 
		
		if(name.contains(" ")) {
			letterCounter++;
		}
		
		int total = name.length()-letterCounter;
		
		System.out.println(total);
		
		// TODO : replace QUB in name with QUEENS UNIVERSITY BELFAST and output the String to screen
		if(name.contains("QUB")) {
			System.out.println(name.replace("QUB", "QUEENS UNIVERSITY BELFAST"));
		}
		
		// TODO : output the number of occurrences of each vowel (UPPER & LOWER CASE) in the string -  
		int vowelA = 0;
		int vowelE = 0;
		int vowelI = 0;
		int vowelO = 0;
		int vowelU = 0;
		
		String[] example = { name };
		
		char[] charLetter = new char[example.length];
		
		for(int loop = 0; loop<=example.length; loop++) {
			charLetter[loop] = example[loop].charAt(loop);
			
			switch(charLetter[loop]) {
			case 'a' :
			case 'A' :
				vowelA++;
				break;
			case 'e' :
			case 'E' :
				vowelE++;
				break;
			case 'i' :
			case 'I' :
				vowelI++;
				break;
			case 'o' :
			case 'O' :
				vowelO++;
				break;
			case 'u' :
			case 'U' :
				vowelU++;
				break;
			default:
			}
			
		}
		
		System.out.println("The number of A's : "+vowelA);
		System.out.println("The number of E's : "+vowelE);
		System.out.println("The number of I's : "+vowelI);
		System.out.println("The number of O's : "+vowelO);
		System.out.println("The number of U's : "+vowelU);

	}

}
