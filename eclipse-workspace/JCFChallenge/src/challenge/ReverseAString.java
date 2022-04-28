package challenge;

public class ReverseAString {
	
	public static void main(String[] args) {
        String reved = rev("Aidan");
        System.out.println(reved);
    } 
    public static String rev(String str) {
        if (str.length() < 2) {
            // base case
            return str;
        }
        return rev(str.substring(1)) + str.charAt(0);
    }

}
