package wrap;

import java.util.ArrayList;
import java.util.Arrays;

public class WrapperExercise1 {

	public static void main(String[] args) {
		
		int i1 = 33;
		String i2 = "999";
		double i3 = 23.4;
		Integer i4 = 4;
		
		int i5 = 67;
		int i6 = 31;
		String i7 = "60";
		double i8 = 22.2;
		int i9 = -22;
		
		ArrayList<Double> numbers = new ArrayList<Double>();
		numbers.add(new Double(i1));
		numbers.add(new Double(i2));
		numbers.add(new Double(i3));
		numbers.add(new Double(i4));
		numbers.add(new Double(i5));
		numbers.add(new Double(i6));
		numbers.add(new Double(i7));
		numbers.add(new Double(i8));
		numbers.add(new Double(i9));
		
		System.out.println("Unsorted.."+numbers.toArray());
		
		Object[] tmpArray = numbers.toArray();
		Arrays.sort(tmpArray);
		
		for(int loop = 0; loop<numbers.size(); loop++) {
			numbers.set(loop, (Double)tmpArray[loop]);
		}
		
		System.out.println("Sorted : "+numbers.toString());
		
		/*
		Double[] numbers = new Double[9];
		
		numbers[0] = new Double(i1);
		numbers[1] = new Double(i2);
		numbers[2] = i3;
		numbers[3] = new Double(i4);
		numbers[4] = new Double(i5);
		numbers[5] = new Double(i6);
		numbers[6] = new Double(i7);
		numbers[7] = i8;
		numbers[8] = new Double(i9);
		
		for(Double number : numbers) {
			System.out.println(number.toString());
		}
		*/
	}

}
