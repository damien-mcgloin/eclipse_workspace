package exercise;

import java.lang.StringBuilder;

public class SBExample {

	public static void main(String[] args) {
		
		longWay();
		
		System.out.println();
		
		sbWay();

	}
	
	public static void longWay() {
		
		String palindrome = "Dot saw I was Tod";
		int length = palindrome.length();
		char[] tempCharArray = new char[length];
		char[] charArray = new char[length];
		
		// put original string in an array of chars (hint - for loop)
		for (int loop = 0; loop<length; loop++) {
			tempCharArray[loop] = palindrome.charAt(loop);
		}
		
		// reverse array of chars (hint - another for loop)
		for (int loop = 0; loop<length; loop++) {
			charArray[loop] = tempCharArray[length - 1 - loop];
		}
		
		// check if the original string was a palindrome
		String reversePalindrome = new String(charArray);
		System.out.println(reversePalindrome);
		
		if(palindrome.equalsIgnoreCase(reversePalindrome)) {
			System.out.println("Palindrome ");
		} else {
			System.out.println("Not a palindrome");
		}
		
	}
	
	public static void sbWay() {
		
		/*
		StringBuilder sb = new StringBuilder();
		
		sb.append("Hello");
		sb.append(". ");
		sb.append("Is there ");
		sb.append("anybody ");
		sb.append("out there");
		sb.append("?");
		System.out.println(sb);
		
		// inserts new string at index 5 - counting in chars from 0-4 this is just after Hello
		sb.insert(5, ", Hola");
		System.out.println(sb);
		*/
		
		String palindrome = "Dot saw I was Tod";
		
		StringBuilder sb = new StringBuilder(palindrome);
		
		sb.reverse(); // reverse it
		
		System.out.println(sb);
		
		
	}

}
