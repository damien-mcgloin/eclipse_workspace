package rw;

import java.util.Arrays;

public class RWExercise4 {

	public static void main(String[] args) {
				
		double[] numbers = new double[9];
		
		int i1 = 33;
		String i2 = "999";
		double i3 = 23.4;
		int i4 = 4;
		int i5 = 67;
		int i6 = 31;
		String i7 = "60";
		double i8 = 22.2;
		int i9 = -22;
		
		numbers[0] = new Double(i1);
		numbers[1] = new Double(i2);
		numbers[2] = new Double(i3);
		numbers[3] = new Double(i4);
		numbers[4] = new Double(i5);
		numbers[5] = new Double(i6);
		numbers[6] = new Double(i7);
		numbers[7] = new Double(i8);
		numbers[8] = new Double(i9);
		
		Arrays.sort(numbers);
		
		for(int loop = 0; loop<numbers.length; loop++) {
		System.out.println(numbers[loop]);
		}
	}

}
