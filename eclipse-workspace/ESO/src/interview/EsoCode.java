package interview;


public class EsoCode {

	public static void main(String[] args) {
		
		String anotherExample = "potato";
		
		System.out.println(reverseString(anotherExample));
		
		System.out.println(checkPalindrome("penet"));
		
		

	}
	
	public static String reverseString(String example) {
		
		String reverseExample = "";
		
		for(int loop = example.length(); loop>0; loop--) {
			//System.out.println(example.charAt(loop-1));
			reverseExample += example.charAt(loop-1);
		}
		
		return reverseExample;
		
	}
	
	public static Boolean checkPalindrome(String example) {
		
		reverseString(example);
		Boolean check = false;
		
		String exampleReverse = reverseString(example);
		
		if(example.equals(exampleReverse)) {
			check = true;
		} 
		
		return check;
		
	}

}
