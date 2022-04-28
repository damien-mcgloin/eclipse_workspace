package recursion;

public class Factorial {
	
	public Factorial() {
		
	}
	
	public static void main(String[] args) {
        System.out.println("Fact 5 "+fact(5));
    }
	
    public static int fact(int num) {
        if (num==1) {
            return 1; // base case
        } else {
            return num * (fact(--num));
        }
    }

}
