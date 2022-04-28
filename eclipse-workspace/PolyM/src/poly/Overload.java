package poly;

public class Overload {

	public static void squareNumbers(double num) {
		System.out.println(num * num);
	}

	public static void squareNumbers(int num) {
		System.out.println(num * num);
	}

	public static void order(int a, double b) {
		System.out.println("Order int then double");
	}
	
	public static void order(double a, int b) {
		System.out.println("Order double then int");
	}
	
	public static void main(String[] args) {

		order(3, 4.56);
		
		/**
		squareNumbers(3);
		squareNumbers(3.6);
		System.out.println();
		*/

	}

}
